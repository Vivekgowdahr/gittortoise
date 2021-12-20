package com.te.logger;

import java.io.IOException;
import java.util.Formatter;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
public static final Logger LOGGER = Logger.getLogger(MyLogger.class.getName());
public static void main(String[] args)throws Exception,IOException {
	
//	ConsoleHandler consoleHandler = new ConsoleHandler();
//	consoleHandler.setLevel(Level.SEVERE);
//	LOGGER.addHandler(consoleHandler);
	
	
	
	FileHandler fileHandler = new FileHandler("C:\\Users\\admin\\Desktop\\logger\\log.log");
	MyFormatter myFormatter=new MyFormatter();
	fileHandler.setFormatter(myFormatter);
	LOGGER.addHandler(fileHandler);
	
	LOGGER.setLevel(Level.FINE);
	LOGGER.finest("I am from finest");
	LOGGER.finer("I am from finer");
	LOGGER.fine("I am from fine");
	LOGGER.config("I am from config");
	LOGGER.info("I am from info");//level info
	LOGGER.warning("I am from warning");
	LOGGER.severe("I am from server");
}
}
