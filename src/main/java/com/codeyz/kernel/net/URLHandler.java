package com.codeyz.kernel.net;

import com.codeyz.kernel.GV;

public class URLHandler {

    public static String formStdUrl() {
        return "https://api.telegram.org/bot" + GV.getSecretKey() + "/";
    }

    public static String formUrlForDownload(String path) {
        return "https://api.telegram.org/file/bot" + GV.getSecretKey() + "/" + path;
    }

    public static String formUrlForPrepare(String fileId) {
        return "https://api.telegram.org/bot" + GV.getSecretKey() + "/" + fileId;
    }
}
