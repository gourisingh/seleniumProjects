package demo_log4j;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class log4jDemo {

    private static final org.apache.logging.log4j.Logger Logger =  LogManager.getLogger(log4jDemo.class);

    public static void main(String[] args) {

        System.out.print("Hello World.....! \n");

        Logger.trace("This is trace message");
        Logger.info("This is info message");
        Logger.error("This is error message ");
        Logger.warn("This is warming message" );
        Logger.fatal("This is fatal message");

        System.out.println("Completed");


    }
}
