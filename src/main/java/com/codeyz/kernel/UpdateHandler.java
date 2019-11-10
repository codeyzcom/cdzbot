package com.codeyz.kernel;

import com.codeyz.middleware.types.Update;
import com.codeyz.operation.Action;
import com.codeyz.operation.ActionHandler;

public class UpdateHandler implements Runnable {

    private String inputData;
    private ActionHandler actions;

    public UpdateHandler(String inputData, ActionHandler actions) {
        this.inputData = inputData;
        this.actions = actions;
    }

    @Override
    public void run() {
        Update update = Update.fromJson(inputData);
        GVars.setUpdateId(update.getUpdateId());

        System.out.println(update.getMessage());

        Action action = actions.getAction("/start");

        action.perform();
    }
}
