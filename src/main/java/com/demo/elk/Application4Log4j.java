package com.demo.elk;

import org.apache.log4j.Logger;

public class Application4Log4j {
    private static final Logger LOGGER = Logger.getLogger(Application4Log4j.class);
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            LOGGER.error("Info log [" + i + "].");
            Thread.sleep(500);
        }
    }
}