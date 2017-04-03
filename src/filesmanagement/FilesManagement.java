/*
 * Class implements four methods for reading/ writing from file
 */
package filesmanagement;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
* @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-12-30
*/

public class FilesManagement {
    
    // write a String content to an empty file
    static void writeToFile(String fileName, String stringToWrite) throws 
            FileNotFoundException, IOException, UnsupportedEncodingException{
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream(fileName), StandardCharsets.UTF_8))) {
            writer.write(stringToWrite);
//            writer.write("First line      ");
//            writer.write("\r\n          Second line.");
        }
        // handle exception for unsupporte encoding
        catch (UnsupportedEncodingException u){
            System.out.println("Error: unsupported encoding! " + u.getMessage());
        }
        //handle exception if specified file doesn't exist
        catch (FileNotFoundException f){
            System.out.println("Error: file does not exist! " + f.getMessage());
        }
        //handle exception if cannot write to file
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }       
            
    }
    
    
    // read content from a specified file
    static String readFile(String fileName, Charset encoding) throws IOException, 
            FileNotFoundException, UnsupportedEncodingException {
        
        try{
            // read content as byte[]
            byte[] encoded = Files.readAllBytes(Paths.get(fileName));
            return new String(encoded, encoding);
        }
        catch (FileNotFoundException f){
            System.out.println("Error: file does not exist! " + f.getMessage());
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
    
    // append String content to an existing file
    public static void appendStringToFile(String fileName, String stringToAppend){
        try (FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)){
                out.println(stringToAppend);
        } 
        catch (UnsupportedEncodingException u){
            System.out.println("Error: unsupported encoding! " + u.getMessage());
        }
        catch (FileNotFoundException f){
            System.out.println("Error: file does not exist! " + f.getMessage());
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // delete content of a file
    // without deleting the file itself   
    public static void deleteContentFromFile(String fileName){
        try{
            // printWriter actually writes an empty String to replace 
            // the existing file content
            PrintWriter pw = new PrintWriter(fileName);
            pw.write("");
            pw.close();
        }
        catch (FileNotFoundException f){
            System.out.println("Error: file does not exist! " + f.getMessage());
        }
    }
}
