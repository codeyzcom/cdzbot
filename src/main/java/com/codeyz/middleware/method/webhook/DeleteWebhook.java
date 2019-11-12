package com.codeyz.middleware.method.webhook;

import com.codeyz.middleware.method.Method;

public class DeleteWebhook implements Method {

    private final static String METHOD_NAME = "deleteWebhook";

    @Override
    public String getResult() throws IllegalAccessException {
        return METHOD_NAME;
    }
}
