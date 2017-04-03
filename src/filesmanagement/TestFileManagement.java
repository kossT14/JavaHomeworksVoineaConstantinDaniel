/*
 * Test class implementation for actions within a specified file
 */
package filesmanagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
* @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-12-30
*/
public class TestFileManagement {
    
    public static final String FILE_NAME = "filename.txt";
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // hard-coded String can be replaced by different input sources
        FilesManagement.writeToFile(FILE_NAME, " aaaaaaaa \r\n bbbbbbbbbbb.."
                + "\r\n cccccccccccccccc!");
        // display content of read file
        System.out.println(FilesManagement.readFile(FILE_NAME, 
                StandardCharsets.UTF_8));
        FilesManagement.appendStringToFile(FILE_NAME, "\r\n append 1");
        FilesManagement.appendStringToFile(FILE_NAME, " append 2");
        // display filecontent after appending strings
        System.out.println(FilesManagement.readFile(FILE_NAME, 
                StandardCharsets.UTF_8));
        FilesManagement.deleteContentFromFile(FILE_NAME);
        // display file content after deleting 
        System.out.println(FilesManagement.readFile(FILE_NAME, 
                StandardCharsets.UTF_8) + "All content deleted!" ); // string added to actually see that there's no other content
    }
}
