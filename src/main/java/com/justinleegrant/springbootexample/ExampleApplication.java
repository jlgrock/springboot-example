package com.justinleegrant.springbootexample;

import com.justinleegrant.springbootexample.controllers.UserController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class ExampleApplication {
    private static Log LOGGER = LogFactory.getLog(ExampleApplication.class);

    public static void main(String[] args) throws Exception {
        LOGGER.info("Starting Example class.");
        SpringApplication.run(ExampleApplication.class, args);
    }
}