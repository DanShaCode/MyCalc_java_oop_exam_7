package ru.sharipov.Model.Classes;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalcLog {

    Logger logger;

    public CalcLog() {
        this.logger = Logger.getLogger(CalcLog.class.getName());

        try {
            FileHandler fileHandler = new FileHandler("MyCalLog.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to initialize file handler", e);
        }
    }

    public void logOperation(){
        logger.info("Общая информация");
    }
}
