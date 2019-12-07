package com.codeyz.kernel.net;

public interface DoRequest {
    default String doGet(String url) {
        return null;
    };

    default String doPost(String url, String body) {
        return null;
    }
}
