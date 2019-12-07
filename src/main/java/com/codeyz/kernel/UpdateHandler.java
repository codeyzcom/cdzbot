package com.codeyz.kernel;

import com.codeyz.operation.ActionHandler;
import com.codeyz.script.ScriptContext;

public class UpdateHandler implements Runnable {

    private String inputData;
    private ActionHandler actions;


    public UpdateHandler(String inputData, ActionHandler actions) {
        this.inputData = inputData;
        this.actions = actions;
    }

    @Override
    public void run() {

        ScriptContext sc = new ScriptContext();
        ScriptDispatcher sd = new ScriptDispatcher(inputData);

        sc.setBaseScript(sd.carry());
        sc.invoke();
    }
}
