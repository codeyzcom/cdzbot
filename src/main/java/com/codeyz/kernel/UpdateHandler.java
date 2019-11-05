package com.codeyz.kernel;

import com.codeyz.middleware.types.Update;


public class UpdateHandler implements Runnable {

    private String inputData;

    public UpdateHandler(String inputData) {
        this.inputData = inputData;
    }

    @Override
    public void run() {
        Update update = Update.fromJson(inputData);

        GVars.setUpdateId(update.getUpdateId());

    }
}
