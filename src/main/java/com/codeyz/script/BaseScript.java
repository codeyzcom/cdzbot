package com.codeyz.script;

public interface BaseScript {

    boolean execute();
    default BaseScript next() {
        return null;
    }
}
