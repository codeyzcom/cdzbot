package com.codeyz.kernel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CentralExecutor {

    private CentralExecutor() {}

    public static ExecutorService exec = Executors.newFixedThreadPool(10);

}
