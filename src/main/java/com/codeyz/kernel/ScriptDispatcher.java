package com.codeyz.kernel;

import com.codeyz.script.BaseScript;
import com.codeyz.script.std.UnknownOperation;

public class ScriptDispatcher {

    private String inData;

    public ScriptDispatcher(String input) {
        this.inData = input;
    }

    public BaseScript carry() {
        BaseScript bs = null;

        // ToDo implement script selection engines
        System.out.println("Script dispatcher working");

        if (bs == null) {
            bs = new UnknownOperation();
        }
        return bs;
    }
}
