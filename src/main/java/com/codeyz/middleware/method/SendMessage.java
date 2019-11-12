package com.codeyz.middleware.method;

import java.lang.reflect.Field;

public class SendMessage implements Method {

    //private final static String METHOD_NAME = "sendMessage";

    private Integer chat_id;
    private String text;

    public SendMessage(Integer chatId, String text) {
        this.chat_id = chatId;
        this.text = text;
    }

    @Override
    public String getResult() throws IllegalAccessException {
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessage" + "?");
        for(Field f: getClass().getDeclaredFields()) {
            if (f.get(this) != null || f.get(this) == "METHOD_NAME") {
                sb.append(f.getName() + "=" + f.get(this) + "&");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public Integer getChatId() {
        return chat_id;
    }

    public void setChatId(Integer chatId) {
        this.chat_id = chatId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
