package com.example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jexample1Application {

	private static final Logger logger = LogManager.getLogger(Log4jexample1Application.class);
	final static Level VERBOSE = Level.forName("VERBOSE", 300);
	
	public static void main(String[] args) {
        logger.error("Entering application.");

        logger.trace("Exiting application.");
        logger.log(VERBOSE, "testing");
        logger.log(Level.forName("VERBOSE", 0), "testing");
        logger.log(Level.ERROR, "testing");
	}

}
