package com.codeyz.middleware.method;

import java.lang.reflect.Field;

public class SendMessage implements Method {

    private final String METHOD_NAME = "sendMessage";
    private String chatId;
    private String text;

    public SendMessage(String chatId, String text) {
        this.chatId = chatId;
        this.text = text;
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

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
