package utils;

import org.apache.log4j.xml.DOMConfigurator;

import java.io.File;
import org.apache.log4j.Logger;

public class Log {
    private static Logger Logger = org.apache.log4j.Logger.getLogger(Log.class.getName());

    public static Logger getLogData(String className){
        String path = new File("").getAbsolutePath();
        DOMConfigurator.configure("log4j.xml");
        return Logger.getLogger(className);
    }

    public static void startTest(String testName){
        Logger.info("Test called " + testName + " has started");
    }

    public static void endTest(String testName){
        Logger.info("Test called " + testName + " has ended");
    }

    public static void info(String msg){
        Logger.info(msg);
    }

    public static void warn(String msg){
        Logger.warn(msg);
    }

    public static void error(String msg){
        Logger.error(msg);
    }

    public static void fatal(String msg){
        Logger.fatal(msg);
    }

}
