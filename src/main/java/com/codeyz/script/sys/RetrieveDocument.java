package com.codeyz.script.sys;

import com.codeyz.kernel.GV;
import com.codeyz.kernel.file.FileHandler;
import com.codeyz.kernel.net.DoRequestOkHttp;
import com.codeyz.kernel.net.DownloadFile;
import com.codeyz.kernel.net.RequestObject;
import com.codeyz.kernel.net.URLHandler;
import com.codeyz.middleware.method.Method;
import com.codeyz.middleware.method.file.GetFile;
import com.codeyz.middleware.types.GetUpdates;
import com.codeyz.middleware.types.Message;
import com.codeyz.middleware.types.file.Document;
import com.codeyz.script.BaseRetrieveScript;
import com.codeyz.script.BaseScript;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class RetrieveDocument implements BaseRetrieveScript {

    private Message message;
    private Document doc;

    public RetrieveDocument(Message message) {
        this.message = message;
        this.doc = message.getDocument();
    }

    @Override
    public boolean execute() {
        String path = FileHandler.formPath(message.getFrom().getId(), GV.DOCUMENT);
        File dir = new File(path);

        if (!dir.isDirectory()) {
            return false;
        }

        String url = URLHandler.formUrlForPrepare(doc.getFileId());
        String fullPath = path + doc.getFileName();

        List<Method> lstm = new LinkedList<>();
        lstm.add(new GetFile(doc.getFileId()));

        RequestObject ro = new RequestObject(new DoRequestOkHttp(), lstm);
        String fileObject = ro.buildGet();

        GetUpdates getUpdates = GetUpdates.fromJson(fileObject);
        getUpdates.getResult();

        DownloadFile downloadFile = new DownloadFile(url, fullPath);
        downloadFile.carry();

        return true;
    }

    @Override
    public BaseScript next() {
        return new RetrieveVoice(message);
    }
}
