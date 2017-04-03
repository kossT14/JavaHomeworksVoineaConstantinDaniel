/*
 * Multiprocess class
 */
package multiprocess;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementation of an application that launches 3 instances of Notepad
 * @author kossT
 */
public class Multiprocess {
    public static void main(String[] args){
        try {
            System.out.println("Opening 3 instances of notepad:");
            ProcessBuilder pb;
            // Use process builder to start 3 processes of notepad
            /**
             * This call works because Notepad is an executable 
             * that is present in the system path. 
             * If the directory containing notepad was not in the system path,
             * this call (without the fully qualified path to notepad)
             * would not work.
             */
            pb = new ProcessBuilder("notepad");
            Process p1 = pb.start();
            Process p2 = pb.start();
            Process p3 = pb.start();
            try {
                // Causes a pause in execution of Multiprocess class for 5 seconds
		Thread.sleep(5000);
            } 
            catch (InterruptedException e) {
		e.printStackTrace();
            }
            System.out.println("Closing notepad instances!...");
            // After 5 seconds, the destroy() calls close the notepad windows
            p1.destroy();
            p2.destroy();
            p3.destroy();	
        } catch (IOException ex) {
            Logger.getLogger(Multiprocess.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
    }
}
