package com.codeyz.script.sys;

import com.codeyz.middleware.types.Message;
import com.codeyz.script.BaseRetrieveScript;

public class RetrieveVoice implements BaseRetrieveScript {

    private Message message;

    public RetrieveVoice(Message message) {
        this.message = message;
    }

    @Override
    public boolean execute() {
        System.out.println("Retrieve Voice!");
        return false;
    }
}
