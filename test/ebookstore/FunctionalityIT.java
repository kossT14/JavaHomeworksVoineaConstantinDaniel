/*
 * JUnit test for Functionality class
 */
package ebookstore;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kossT
 */
public class FunctionalityIT {
    
    public FunctionalityIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of checkRetry method, of class Functionality.
     */
    @Test
    public void testCheckRetry() {
        System.out.println("checkRetry");
        String input = "  n ";
        Functionality instance = new Functionality();
        boolean expResult = false;
        boolean result = instance.checkRetry(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of limitDescription method, of class Functionality.
     */
    @Test
    public void testLimitDescription() {
        System.out.println("limitDescription");
        String value = "In 1903 Mary Boulton flees alone across the West,"
                + " one heart-pounding step ahead of the law. At nineteen,"
                + " she has just become a widow-and her husband's killer. "
                + "As bloodhounds track her frantic race toward the mountains, "
                + "she is tormented by mad visions and by the knowledge that "
                + "her two ruthless brothers-in-law are in pursuit, determined "
                + "to avenge their younger brother's death. Responding to little "
                + "more than the primitive instinct for survival at any cost, "
                + "she retreats ever deeper into the wilderness-and into the "
                + "wilds of her own mind."; 
        int length = 255;
        String expResult = "In 1903 Mary Boulton flees alone across the West,"
                + " one heart-pounding step ahead of the law. At nineteen,"
                + " she has just become a widow-and her husband's killer."
                + " As bloodhounds track her frantic race toward the mountains,"
                + " she is tormented by mad visions and ...";
        String result = Functionality.limitDescription(value, length);
        assertEquals(expResult, result);
    }

    /**
     * Test of createID method, of class Functionality.
     */
    @Test
    public void testCreateID() {
        System.out.println("createID");
        int expResult = 1;
        int result = Functionality.createID();
        assertEquals(expResult, result);
    }
    
}
