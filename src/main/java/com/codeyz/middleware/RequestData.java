package com.codeyz.middleware;

public class RequestData {

    private static RequestData instance = new RequestData();
    private static String url;
    private static String secretKey;

    private RequestData() {};

    public static RequestData getInstance() {
        return instance;
    }

    public static void setUrl(String url) {
        RequestData.url = url;
    }

    public static String getSecretKey() {
        return secretKey;
    }

    public static void setSecretKey(String secretKey) {
        RequestData.secretKey = secretKey;
    }

    public static String getUrl() {
        return url + "/bot" + secretKey + "/";
    }
}
