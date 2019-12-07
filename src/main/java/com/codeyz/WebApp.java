package com.codeyz;

import com.codeyz.kernel.GV;
import com.codeyz.kernel.file.PropertiesHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication()
public class WebApp extends SpringBootServletInitializer {
    public static void main(String[] args) {

        GV.setSecretKey(PropertiesHandler.getProp("secretKey"));
        GV.setPathToStore(PropertiesHandler.getProp("pathToStore"));
        GV.setEnhancementSecure(Boolean.valueOf(PropertiesHandler.getProp("enhancementSecure")));

        SpringApplication.run(WebApp.class);
    }
}
