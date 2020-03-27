package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LogDemo1Application {
	
	private static final Logger logger=LoggerFactory.getLogger(LogDemo1Application.class);
	public static void main(String[] args) {
       
        
        logger.info("Hi this is info level");
        logger.error("Hi this is error level");
        logger.debug("Hi this is debug level");
        logger.warn("Hi this is warn level");
        logger.trace("Hi this is trace level");
        SpringApplication.run(LogDemo1Application.class, args);
    }
}
