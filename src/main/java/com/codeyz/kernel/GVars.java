package com.codeyz.kernel;


public class GVars {

    private static Integer updateId = 0;

    public static synchronized Integer getUpdateId() {
        return updateId;
    }

    public static synchronized void setUpdateId(Integer updateIdIn) {
        if (updateId < updateIdIn) {
            GVars.updateId = updateIdIn;
        }
    }


}
