/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author bryan.silva
 */
public class LoggerUtil {

    public void LoggerProperty() {
//        PropertyConfigurator.configure(getClass().getProtectionDomain().getCodeSource().getLocation().getPath() + "log4j-console-file.properties");
        PropertyConfigurator.configure("C:\\log4j-console-file.properties");
    }

    public static final Logger outLogger(Class<?> loggerClass) {
        LoggerUtil util = new LoggerUtil();
        util.LoggerProperty();
        Logger logger = Logger.getLogger(loggerClass.getName());
        return logger;
    }
}
