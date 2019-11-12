package com.codeyz.middleware.method.webhook;

import com.codeyz.middleware.method.Method;

import java.lang.reflect.Field;
import java.util.Arrays;

public class SetWebHook implements Method {

    private final static String METHOD_NAME = "setWebhook";
    private String url;
    // private InputFile certificate; Todo
    private Integer max_connections;
    private String[] allowed_updates;

    public SetWebHook(String url) {
        this.url = url;
    }

    public String getResult() throws IllegalAccessException {
        StringBuilder sb = new StringBuilder();
        sb.append(METHOD_NAME + "?");
        for(Field f: getClass().getDeclaredFields()) {
            if (f.get(this) != null) {
                sb.append(f.getName() + "=" + f.get(this) + "&");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }


    public String getMETHOD_NAME() {
        return METHOD_NAME;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getMax_connections() {
        return max_connections;
    }

    public void setMax_connections(Integer max_connections) {
        this.max_connections = max_connections;
    }

    public String[] getAllowed_updates() {
        return allowed_updates;
    }

    public void setAllowed_updates(String[] allowed_updates) {
        this.allowed_updates = allowed_updates;
    }

    @Override
    public String toString() {
        return "SetWebHook{" +
                "METHOD_NAME='" + METHOD_NAME + '\'' +
                ", url='" + url + '\'' +
                ", max_connections=" + max_connections +
                ", allowed_updates=" + Arrays.toString(allowed_updates) +
                '}';
    }
}
