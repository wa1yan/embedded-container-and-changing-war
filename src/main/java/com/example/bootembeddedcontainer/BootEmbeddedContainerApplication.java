package com.example.bootembeddedcontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootEmbeddedContainerApplication extends SpringBootServletInitializer {

    //1. extends SpringBootServletInitializer in main is for external server
    //2. add packaging war in pom


//   public static void main(String[] args) {
//        SpringApplication.run(BootEmbeddedContainerApplication.class, args);
//    }

}
