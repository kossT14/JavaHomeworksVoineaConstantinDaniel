/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
* @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-12-30
*/

public class UseOfLogger {
    
    private static Logger logger = Logger.getLogger("my.class.fqn");

    public static void main(String[] args) {
        logger.info("start main");
        try {
            String file = "read it from UI";
            readFirstLine(file);
            //more code that throws exceptions
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error during run", e);
        }
        logger.info("end main");
    }
    
    
    public static void readFirstLine(String file) {
        try (BufferedReader r = new BufferedReader(new FileReader(file))) {
            String firstLine = r.readLine();
        } catch (IOException e) {
        //do not log here
            throw new RuntimeException("Cannot read first line from file " 
                                        + file, e);
        }
    }
}
