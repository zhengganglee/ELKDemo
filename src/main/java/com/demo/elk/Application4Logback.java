package com.demo.elk;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application4Logback {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application4Logback.class);
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            LOGGER.error("Info log [" + i + "].");
            Thread.sleep(500);
        }
    }
}