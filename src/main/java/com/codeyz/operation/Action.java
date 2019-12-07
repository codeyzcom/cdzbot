package com.codeyz.operation;

import com.codeyz.kernel.net.RequestObject;
import com.codeyz.middleware.types.Update;

public interface Action {

    String getKey();
    void setData(Update update);
    void perform();
    RequestObject getResult();

}
