/*
 * JUnit test for Author class
 */
package ebookstore;

import java.util.HashSet;
import java.util.Set;
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
public class AuthorIT {
    
    public AuthorIT() {
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
     * Test of addAuthors method, of class Author.
     */
    @Test
    public void testAddAuthors() {
        System.out.println("addAuthors");
        String authorName = "Suzanne";
        String authorSurname = "Collins";
        Author anotherAuthor = new Author(0, authorName, authorSurname);
        Set<Author> currentList = new HashSet<>();
        Set<Author> allAuthors = new HashSet<>();
        Ebook eb = new NovelEbook(NovelEbookEnum.FICTION, "isbn", "The hunger games", 374, currentList, 50);
        currentList.add(anotherAuthor);
        allAuthors.add(anotherAuthor);    
        assertTrue((currentList.contains(anotherAuthor)) && (allAuthors.contains(anotherAuthor)));
    }

    /**
     * Test of displayAuthorsDetails method, of class Author.
     */
    @Test
    public void testDisplayAuthorsDetails() {
        System.out.println("displayAuthorsDetails");
        Author.displayAuthorsDetails();
    }

    /**
     * Test of getId method, of class Author.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Author instance = new Author(234, "Mary", "Shelley");
        int expResult = 234;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Author.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Author instance = new Author(123, "Herman", "Melville");
        String expResult = "Herman";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSurname method, of class Author.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Author instance = new Author(333, "Daniel", "Defoe");
        String expResult = "Defoe";
        String result = instance.getSurname();
        assertEquals(expResult, result);
    }
    
}
