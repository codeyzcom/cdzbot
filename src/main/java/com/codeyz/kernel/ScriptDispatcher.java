package com.codeyz.kernel;

import com.codeyz.kernel.file.FileHandler;
import com.codeyz.middleware.types.Message;
import com.codeyz.middleware.types.Update;
import com.codeyz.script.BaseScript;
import com.codeyz.script.std.auth.CheckAuthorization;
import com.codeyz.script.sys.RetrieveVoice;
import com.codeyz.script.std.UnknownOperation;
import com.codeyz.script.sys.RetrieveAudio;
import com.codeyz.script.sys.RetrieveDocument;


public class ScriptDispatcher {

    private String inData;

    public ScriptDispatcher(String input) {
        this.inData = input;
    }

    public BaseScript carry() {
        BaseScript bs = null;

        Update update = Update.fromJson(inData);
        Message message = update.getMessage();

        if (GV.getEnhancementSecure()) {
            CheckAuthorization ca = new CheckAuthorization();
            if(!ca.execute()) {
                return null;
            }

        }

        if (!FileHandler.checkUserDirectory(message.getFrom().getId())) {
            FileHandler.initUserDirectory(message.getFrom().getId());
        }

        if (message.getText() != null) {

        } else if (message.getAudio() != null) {
            bs = new RetrieveAudio(message);
        } else if (message.getDocument() != null) {
            bs = new RetrieveDocument(message);
        } else if (message.getVoice() != null) {
            bs = new RetrieveVoice(message);
        }


        if (bs == null) {
            bs = new UnknownOperation();
        }
        return bs;
    }
}
