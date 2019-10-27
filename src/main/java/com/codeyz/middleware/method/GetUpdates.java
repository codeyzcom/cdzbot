package com.codeyz.middleware.method;

import java.lang.reflect.Field;

public class GetUpdates implements Method {

    private final String METHOD_NAME = "getUpdates";
    private Integer offset;
    private Integer limit;
    private Integer timeout = 0;

    public GetUpdates() {}

    public GetUpdates(Integer offset) {
        this.offset = offset;
    }

    public GetUpdates(Integer offset, Integer limit) {
        this.offset = offset;
        this.limit = limit;
    }

    public GetUpdates(Integer offset, Integer limit, Integer timeout) {
        this.offset = offset;
        this.limit = limit;
        this.timeout = timeout;
    }

    @Override
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

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
}
