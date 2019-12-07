package com.codeyz.kernel.net;

import com.codeyz.kernel.GV;

public class RequestData {

    private static RequestData instance = new RequestData();
    private static String url;

    private RequestData() {};

    public static RequestData getInstance() {
        return instance;
    }

    public static void setUrl(String url) {
        RequestData.url = url;
    }

    public static String getUrl() {
        return url + "/bot" + GV.getSecretKey() + "/";
    }
}
