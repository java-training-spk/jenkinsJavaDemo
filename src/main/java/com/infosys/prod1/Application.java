package com.infosys.prod1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
	
	static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
	        logger.debug("debug message");
	        logger.info("info message");
	        logger.error("error message");
	        logger.warn("warning message");
	}
}


