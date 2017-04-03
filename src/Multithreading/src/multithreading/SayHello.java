/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kossT
 */
public class SayHello {
    public static void main(String[] args){
        String numberOfParameters = args[0];
        int numberOfParam = Integer.parseInt(numberOfParameters);
        try (FileWriter fw = new FileWriter("C:\\Users\\kossT\\Desktop\\MultithreadingFile.txt")) {
            for(int param=1;param <= numberOfParam;param++){
                fw.append("Hello " + args[param] +"\n");
    // read process environment. System will deliver default variables and also variables defined by me.
                Map<String, String> env = System.getenv();
                String congrats = env.get("TEXT_CONGRATS");
                String hi = env.get("TEXT_HI");
                fw.append(System.getProperty("line.separator") + "ENVIRONMENT VARIABLE CONGRATS: " + congrats);
                fw.append(System.getProperty("line.separator") + "ENVIRONMENT VARIABLE HI: " + hi);
                fw.append(System.getProperty("line.separator") + "Hello (to arguments): " + args[param]);
                System.out.println("ENVIRONMENT VARIABLE CONGRATS: " + congrats + "\n");
                System.out.println("ENVIRONMENT VARIABLE HI: " + hi + "\n");
                System.out.println("MAIN METHOD ARGUMENT: " + args[param] + "\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(SayHello.class.getName()).log(Level.SEVERE, "File could not be open", ex);
        }
    }
}

