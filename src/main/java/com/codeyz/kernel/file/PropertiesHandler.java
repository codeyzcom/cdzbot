package com.codeyz.kernel.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandler {

    private static Properties appProps;

    static {
        try {
            String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
            String appConfigPath = rootPath + "app.properties";
             appProps = new Properties();
            appProps.load(new FileInputStream(appConfigPath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProp(String key) {
        return appProps.getProperty(key);
    }
}
