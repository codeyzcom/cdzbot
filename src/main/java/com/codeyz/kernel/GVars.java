package com.codeyz.kernel;

import com.codeyz.operation.Action;

import java.util.HashMap;
import java.util.Map;

public class GVars {

    private static Integer updateId = 0;
    private static Map<String, Action> opRegister;

    static {
        opRegister = new HashMap<>();
    }

    public static synchronized Integer getUpdateId() {
        return updateId;
    }

    public static synchronized void setUpdateId(Integer updateIdIn) {
        if (updateId < updateIdIn) {
            GVars.updateId = updateIdIn;
        }
    }


    public static void regAction(String key, Action action) {
        opRegister.put(key, action);
    }

    public static Action getAction(String key) {
        return opRegister.get(key);
    }

    public static void actionDelete(String key) {
        opRegister.remove(key);
    }

}
