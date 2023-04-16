package ru.sharipov.Model.Classes;

import lombok.Data;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@Data
public class CalcLog {

    Logger logger;
    FileHandler fileHandler;
    SimpleFormatter simpleFormatter;

    public CalcLog() {
        this.logger = Logger.getLogger(CalcLog.class.getName());

        try {
            this.fileHandler = new FileHandler("MyCalLog.txt");
            logger.addHandler(fileHandler);
            this.simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to initialize file handler", e);
        }
    }

}
