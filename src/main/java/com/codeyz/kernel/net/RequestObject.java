package com.codeyz.kernel.net;

import com.codeyz.middleware.method.Method;

import java.util.List;

public class RequestObject {

    private DoRequest doRequest;
    private List<Method> methods;

    public RequestObject(DoRequest doRequest, List<Method> methods) {
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
        System.out.println(sb.toString());
        return doRequest.doGet(sb.toString());
    }
}
