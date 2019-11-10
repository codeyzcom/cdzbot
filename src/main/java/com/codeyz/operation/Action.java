package com.codeyz.operation;

import com.codeyz.kernel.net.RequestObject;
import com.codeyz.middleware.types.AType;

public interface Action {

    String getKey();
    void setData(AType object);
    void perform();
    RequestObject getResult();
}
