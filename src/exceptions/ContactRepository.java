/*
 * Class implementation for saving contact details
 */
package exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
* @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-12-30
*/

class ContactRepository {
    String file;
    // convenience constructor
    ContactRepository(String file) { 
        this.file = file; 
    }

    void saveContact(String name, String email){
        String row = name + "," + email + "\n";
        writeRow(row);
    }
 
    //method used to write String content into a file
    void writeRow(String row) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
            out.write(row);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ContactRepository repo = new ContactRepository("x:\\file.csv");
        repo.saveContact("Adrian", "123");
    }
}
