package org.example.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {
    private static Logger logger = LogManager.getLogger(LoggerDemo.class); // Aqui esta sendo feita a instancia de um Logger associado a classe LoggerDemo

    public static void main(String[] args) {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
    }
}
