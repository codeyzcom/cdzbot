package com.codeyz.middleware.method.file;

import com.codeyz.middleware.method.Method;

import java.lang.reflect.Field;

public class GetFile implements Method {

    private final static String METHOD_NAME = "getFile";

    private String file_id;

    public GetFile(String fileId) {
        this.file_id = fileId;
    }

    @Override
    public String getResult() throws IllegalAccessException {
        return METHOD_NAME + "?file_id=" + file_id;
    }
}
