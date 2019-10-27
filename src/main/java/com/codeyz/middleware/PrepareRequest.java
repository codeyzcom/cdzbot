package com.codeyz.middleware;

import com.codeyz.middleware.method.Method;

import java.util.List;

public class PrepareRequest {

    private DoRequest doRequest;
    private List<Method> methods;

    public PrepareRequest(DoRequest doRequest, List<Method> methods) {
        this.doRequest = doRequest;
        this.methods = methods;
    }

    public String buildGet() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequestData.getUrl());
        for (Method m: methods) {
            try {
                sb.append(m.getResult());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return doRequest.doGet(sb.toString());
    }
}
