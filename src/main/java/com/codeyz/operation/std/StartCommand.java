package com.codeyz.operation.std;

import com.codeyz.kernel.GVars;
import com.codeyz.kernel.net.RequestObject;
import com.codeyz.middleware.types.AType;
import com.codeyz.operation.Action;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class StartCommand implements Action {

    private static final String ACT_NAME = "/start";

    private RequestObject ro;
    private Integer chatId;
    private String text;

    public String getKey() {
        return ACT_NAME;
    }

    @Override
    public void setData(AType object) {

    }

    @Override
    public void perform() {
        System.out.println("PERRFORM!!!");

    }

    @Override
    public RequestObject getResult() {
        return null;
    }
}
