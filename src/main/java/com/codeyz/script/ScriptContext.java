package com.codeyz.script;


public class ScriptContext {

    private BaseScript baseScript;

    public ScriptContext() {
    }

    public ScriptContext(BaseScript baseScript) {
        this.baseScript = baseScript;
    }

    public void setBaseScript(BaseScript baseScript) {
        this.baseScript = baseScript;
    }

    public boolean invoke() {
        return baseScript.execute();
    }
}
