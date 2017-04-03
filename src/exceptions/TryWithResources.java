/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
* @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-12-30
*/

public class TryWithResources implements AutoCloseable{
    
    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        BufferedReader r = new BufferedReader(new FileReader("text.txt"));
        try {        
            String firstLine = r.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file text.txt: " +
                                e.getMessage());
        } catch (IOException e) {
            System.out.println("Cannot read first line from text.txt: " +
                                e.getMessage());
//        } finally {
//            r.close();
        }
    }
    
}
