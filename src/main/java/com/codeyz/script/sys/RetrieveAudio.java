package com.codeyz.script.sys;

import com.codeyz.middleware.types.Message;
import com.codeyz.script.BaseRetrieveScript;

public class RetrieveAudio implements BaseRetrieveScript {

    private Message message;

    public RetrieveAudio(Message message) {
        this.message = message;
    }

    @Override
    public boolean execute() {
        return false;
    }
}
