/*
 * JUnit tests for Ebook class
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
public class EbookIT {
    
    public EbookIT() {
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
     * Test of getSubcategory method, of class Ebook.
     */
    @Test
    public void testGetSubcategory() {
        System.out.println("getSubcategory");
        String isbn = "85-420-68-7";
        String title = "The lord of the rings";
        int noOfPages = 200;
        double price = 50;
        Set<Author> listOfAut = new HashSet<>();
        Ebook novel = new NovelEbook(NovelEbookEnum.FICTION, isbn, title, noOfPages, listOfAut, price);
        String expResult = "Subcategory: FICTION";
        String result = novel.getSubcategory();
        assertEquals(expResult, result);
    }

    /**
     * Test of setISBN method, of class Ebook.
     */
    @Test
    public void testSetISBN() {
        System.out.println("setISBN");
        String isbn = "85-420-68-7";
        String title = "The lord of the rings";
        int noOfPages = 200;
        double price = 50;
        Set<Author> listOfAut = new HashSet<>();
        Ebook novel = new NovelEbook(NovelEbookEnum.FICTION, isbn, title, noOfPages, listOfAut, price);
        String expResult = "45-765-98-1";
        String result = novel.setISBN();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashOp method, of class Ebook.
     */
    @Test
    public void testHashOp() {
        System.out.println("hashOp");
        int i = 5;
        int expResult = 1;
        int result = Ebook.hashOp(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of updatePrice method, of class Ebook.
     */
    @Test
    public void testUpdatePrice() {
        System.out.println("updatePrice");
        String isbn = "85-420-68-7";
        String title = "The lord of the rings";
        int noOfPages = 200;
        double price = 50;
        Set<Author> listOfAut = new HashSet<>();
        Ebook novel = new NovelEbook(NovelEbookEnum.FICTION, isbn, title, noOfPages, listOfAut, price);
        Collections.getAllEbooks().add(novel);
        String newPrice = "55";
        Ebook.updatePrice(novel, newPrice);
        assertTrue(novel.getPrice() == Double.parseDouble(newPrice));
    }

    /**
     * Test of addRating method, of class Ebook.
     */
    @Test
    public void testAddRating() {
        System.out.println("addRating");
        String isbn = "85-420-68-7";
        String title = "The lord of the rings";
        int noOfPages = 200;
        double price = 50;
        Set<Author> listOfAut = new HashSet<>();
        Ebook novel = new NovelEbook(NovelEbookEnum.FICTION, isbn, title, noOfPages, listOfAut, price);
        Ebook.addRating(novel);
        assertTrue(!(novel.getRating() == 0));
    }

    /**
     * Test of sellBook method, of class Ebook.
     */
    @Test
    public void testSellBook() {
        System.out.println("sellBook");
        String isbn = "85-420-68-7";
        String title = "The lord of the rings";
        int noOfPages = 200;
        double price = 50;
        Set<Author> listOfAut = new HashSet<>();
        Ebook novel = new NovelEbook(NovelEbookEnum.FICTION, isbn, title, noOfPages, listOfAut, price);
        Ebook.sellBook(novel);
        assertTrue(!(Collections.getAllEbooks().isEmpty()));
    }

    /**
     * Test of getBookByISBN method, of class Ebook.
     */
    @Test
    public void testGetBookByISBN() {
        System.out.println("getBookByISBN");
        String isbn = "78-456-23-1";
        String title = "The lord of the rings";
        int noOfPages = 200;
        double price = 50;
        Set<Author> listOfAut = new HashSet<>();
        Ebook novel = new NovelEbook(NovelEbookEnum.FICTION, isbn, title, noOfPages, listOfAut, price);
        Collections.getAllEbooks().add(novel);
        System.out.println("Please enter the following ISBN when required:"
                + " 85-420-68-7");
        Ebook result = Ebook.getBookByISBN();
        assertEquals(novel, result);
    }

    /**
     * Test of removeBook method, of class Ebook.
     */
    @Test
    public void testRemoveBook() {
        System.out.println("removeBook");
        String isbn = "85-420-68-7";
        String title = "The lord of the rings";
        int noOfPages = 200;
        double price = 50;
        Set<Author> listOfAut = new HashSet<>();
        Ebook novel = new NovelEbook(NovelEbookEnum.FICTION, isbn, title, noOfPages, listOfAut, price);
        Collections.getAllEbooks().add(novel);
        Ebook.removeBook(novel);
        assertTrue(Collections.getAllEbooks().isEmpty());
    }

    /**
     * Test of addBook method, of class Ebook.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        String isbn = "85-420-68-7";
        String title = "The lord of the rings";
        int noOfPages = 200;
        double price = 50;
        Set<Author> listOfAut = new HashSet<>();
        Ebook novel = new NovelEbook(NovelEbookEnum.FICTION, isbn, title, noOfPages, listOfAut, price);
        Ebook.addBook(novel);
        assertTrue((Collections.getAllEbooks().contains(novel)) 
                && (Collections.geteBookRatings().containsKey(novel))
                && (Collections.geteBookAuthorsMap().containsKey(novel)));
    }

    /**
     * Test of getCurrentRating method, of class Ebook.
     */
    @Test
    public void testGetCurrentRating() {
        System.out.println("getCurrentRating");
        String isbn = "85-420-68-7";
        String title = "The lord of the rings";
        int noOfPages = 200;
        double price = 50;
        Set<Author> listOfAut = new HashSet<>();
        Ebook novel = new NovelEbook(NovelEbookEnum.FICTION, isbn, title, noOfPages, listOfAut, price);
        String expResult = "Rating not available yet!";
        String result = Ebook.getCurrentRating(novel);
        assertEquals(expResult, result);
    }

    /**
     * Test of getISBN method, of class Ebook.
     */
    @Test
    public void testGetISBN() {
        System.out.println("getISBN");
        String isbn = "85-420-68-7";
        String title = "The lord of the rings";
        int noOfPages = 200;
        double price = 50;
        Set<Author> listOfAut = new HashSet<>();
        Ebook novel = new NovelEbook(NovelEbookEnum.FICTION, isbn, title, noOfPages, listOfAut, price);
        String expResult = "85-420-68-7";
        String result = novel.getISBN();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTitle method, of class Ebook.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String isbn = "85-420-68-7";
        String title = "The lord of the rings";
        int noOfPages = 200;
        double price = 50;
        Set<Author> listOfAut = new HashSet<>();
        Ebook novel = new NovelEbook(NovelEbookEnum.FICTION, isbn, title, noOfPages, listOfAut, price);
        String expResult = "The lord of the rings";
        String result = novel.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNoOfPages method, of class Ebook.
     */
    @Test
    public void testGetNoOfPages() {
        System.out.println("getNoOfPages");
        String isbn = "85-420-68-7";
        String title = "The lord of the rings";
        int noOfPages = 200;
        double price = 50;
        Set<Author> listOfAut = new HashSet<>();
        Ebook novel = new NovelEbook(NovelEbookEnum.FICTION, isbn, title, noOfPages, listOfAut, price);
        int expResult = 200;
        int result = novel.getNoOfPages();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getPrice method, of class Ebook.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Ebook instance = new EbookImpl();
        double expResult = 66d;
        instance.setPrice(expResult);
        double result = instance.getPrice();
        assertEquals(expResult, result, 66d);
    }

    /**
     * Test of setPrice method, of class Ebook.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 55d;
        Ebook instance = new EbookImpl();
        instance.setPrice(price);
        assertTrue(instance.getPrice() == price);
    }

    /**
     * Test of getRating method, of class Ebook.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        Ebook instance = new EbookImpl();        
        float expResult = 2f;
        instance.setPrice(expResult);
        float result = instance.getRating();
        assertEquals(expResult, result, 2f);
    }

    /**
     * Test of setRating method, of class Ebook.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        float rating = 3.5f;
        Ebook instance = new EbookImpl();
        instance.setRating(rating);
        assertTrue(instance.getRating() == rating);
    }

    public class EbookImpl extends Ebook {

        public String getSubcategory() {
            return "";
        }
    }
    
}
