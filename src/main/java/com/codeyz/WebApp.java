package com.codeyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@SpringBootApplication
public class WebApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WebApp.class);
    }

}
