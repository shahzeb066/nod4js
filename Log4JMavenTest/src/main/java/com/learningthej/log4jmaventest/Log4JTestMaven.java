/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learningthej.log4jmaventest;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;

/**
 *
 * @author Rayan
 */
public class Log4JTestMaven {
    public static void main(String[] args) {
        
    
    org.apache.logging.log4j.Logger logger = null;        
        System.setProperty("logfilename", "myLogs");
        
        String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j2.xml";
        ConfigurationSource source;
        try {
            source = new ConfigurationSource(new FileInputStream(log4jConfigFile));

            Configurator.initialize(null, source);

            logger = LogManager.getLogger();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Log4JTestMaven.class.getName()).log(Level.SEVERE, null, ex);
        }
        logger.info(" xxxxx Logging initialized for LabAutomation ");
        logger.error(" Error Messages ");
    }
}    

