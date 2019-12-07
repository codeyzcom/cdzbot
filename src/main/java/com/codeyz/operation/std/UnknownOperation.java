package com.codeyz.operation.std;

import com.codeyz.kernel.net.DoRequestOkHttp;
import com.codeyz.kernel.net.RequestObject;
import com.codeyz.middleware.method.Method;
import com.codeyz.middleware.method.SendMessage;
import com.codeyz.middleware.types.Update;
import com.codeyz.operation.Action;

import java.util.LinkedList;
import java.util.List;


public class UnknownOperation implements Action {

    private final static String ACT_NAME = "UnknownOperation";

    private RequestObject req;
    private Long chatId;

    @Override
    public String getKey() {
        return ACT_NAME;
    }

    @Override
    public void setData(Update update) {
        chatId = update.getMessage().getChat().getId();
    }

    @Override
    public void perform() {
        List<Method> methods = new LinkedList<>();
        methods.add(new SendMessage(chatId, "Unknown operation! Try again!"));
        req = new RequestObject(new DoRequestOkHttp(), methods);
    }

    @Override
    public RequestObject getResult() {
        return req;
    }
}
