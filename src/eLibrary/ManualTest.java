/*
 * ManualTest class 
 */
package eLibrary;

import java.util.HashSet;
import java.util.Set;

/**
 *  Class implementation that tests most of the methods defined for classes 
 * Functionality, Author and Ebook
 * @author kossT
 */
public class ManualTest {
    
    static void testFunctionalityClass(){
        System.out.println("Test Functionality class:");
        
        // Test checkRetry() method
        System.out.println("\t1. Test checkRetry(String input) method:");
        String yesInput = " y  ";
        String noInput = "       n ";
        Functionality fun = new Functionality();
        if (fun.checkRetry(noInput) == false){
            System.out.println("\t- checkRetry method works for \"n\" option");
        }else{
            System.out.println("\t- checkRetry method doesn't work for \"n\" option");
        }
        if (fun.checkRetry(yesInput) == true){
            System.out.println("\t- check retry works for \"y\" option");
         }else{
            System.out.println("\t- checkRetry method doesn't work for \"y\" option");
        }
        System.out.println("\t***For any other input provided, this method "
                + "recalls itself, returning \"true\" only for \"y\" "
                + " or \"false\" only for \"n\"");
        
        // Test limitDescription() method
        System.out.println("\n\t2. Test limitDescription(String value, int length) method:");
        String value1 = "";
        String value2 = "Any content not loger than 255 characters.";
        String value3 = "In 1903 Mary Boulton flees alone across the West,"
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
        System.out.println(Functionality.limitDescription(value3, length));
        if (Functionality.limitDescription(value1, length).equals(value1)){
            System.out.println("\t- limitDescription method works for void String");
        }else{
            System.out.println("\t- limitDescription method doesn't work for void String");
        }
        if (Functionality.limitDescription(value2, length).equals(value2)){
            System.out.println("\t- limitDescription method works for any String"
                    + " not longer than 255 characters");
        }else{
            System.out.println("\t- limitDescription method doesn't work "
                    + "for any String not longer than 255 characters");
        }        
        if (Functionality.limitDescription(value3, length).equals(value3.substring(0, 255) + "...")){
            System.out.println("\t- limitDescription method works for any String"
                    + "longer than 255 characters");
        }else{
            System.out.println("\t- limitDescription method doesn't work "
                    + "for any String longer than 255 characters");
        }
        
        // Test createID() method
        System.out.println("\n\t3. Test createID() method to be sure it's"
                    + " returning unique int values each time when called:");
        System.out.println("\t - first value: " + Functionality.createID()
                        + "\n\t - second value: " + Functionality.createID()
                        + "\n\t - third value: " + Functionality.createID() 
                        + "\n\t - forth value: " + Functionality.createID()
                        + "\n\t - fifth value: " + Functionality.createID()
                        + "\n\t - ...and so on...");
    }  
    
    static void testAuthorClass(){
        System.out.println("Test Author class:");
        
        // Test constructor
        System.out.println("\t1. Test constructor:");
        String name = "Grigore";
        String surname = "Ureche";
        Author author = new Author(0, name, surname);
        if ((author.getName().equals(name)) && (author.getSurname().equals(surname))){
            System.out.println("\t- constructor works for given Strings");
        }else{
            System.out.println("\t- constructor doesn't work for given Strings");
        }
        
        // Test addAuthors() method
        System.out.println("\n\t2. Test addAuthors() method:");
        String authorName = "Suzanne";
        String authorSurname = "Collins";
        Author anotherAuthor = new Author(0, authorName, authorSurname);
        Set<Author> currentList = new HashSet<>();
        Set<Author> allAuthors = new HashSet<>();
        Ebook eb = new NovelEbook(NovelEbookEnum.FICTION, "isbn", "The hunger games", 374, currentList, 50);
        currentList.add(anotherAuthor);
        allAuthors.add(anotherAuthor);    
        for (Author aut : currentList){
            if ((aut.getName().equals(authorName)) && (aut.getSurname().equals(authorSurname))){
                System.out.println("\t- tested method works for adding an author to"
                        + " the list of authors for specified eBook");
            }else{
                System.out.println("\t- tested method doesn't work for adding an author to"
                        + " the list of authors for specified eBook");
            }
        }
        for (Author au : allAuthors){
            if ((au.getName().equals(authorName)) && (au.getSurname().equals(authorSurname))){
                System.out.println("\t- tested method works for adding an author to"
                        + " the global list of authors");
            }else{
                System.out.println("\t- tested method doesn't work for adding an author to"
                        + " the global list of authors");
            }
        }
    }    
    
    static void testEbookClass(){
        System.out.println("Test Ebook class:");
        
        // Test constructor
        System.out.println("\t1. Test constructor:");
        String isbn = "85-420-68-7";
        String title = "The lord of the rings";
        int noOfPages = 200;
        double price = 50;
        Author author = new Author(0, "John Ronald Reuel", "Tolkien");
        Set<Author> listOfAut = new HashSet<>();
        listOfAut.add(author);
        Ebook novel = new NovelEbook(NovelEbookEnum.FICTION, isbn, title, noOfPages, listOfAut, price);
        Collections.getAllEbooks().add(novel);
        if ((novel.getISBN().equals(isbn)) && (novel.getTitle().equals(title))
                && (novel.getNoOfPages() == noOfPages)
                && (novel.getListOfAuthors().contains(author))
                && (novel.getPrice() == price)){
            System.out.println("\t- constructor works for given input");
        }else{
            System.out.println("\t- constructor doesn't work for given input");
        }
        
        // Test hashOp() method
        System.out.println("\t2. Test hashOp() method:");
        int i1 = 3;
        int i2 = 5;
        int i3 = 7;
        if ((Ebook.hashOp(i1) == 6) && (Ebook.hashOp(i2) == 1 && Ebook.hashOp(i3) == 5)){
            System.out.println("\t- method works for given input");
        }else{
            System.out.println("\t- method doesn't work for given input");
        }
        
        // Test updatePrice() method
        System.out.println("\t3. Test updatePrice() method:");
        String newPrice = "60";
        Ebook.updatePrice(novel, newPrice);
        if (novel.getPrice() == Double.parseDouble(newPrice)){
            System.out.println("\t- method works to update to new price");
        }else{
            System.out.println("\t- method doesn't work to update new price");
        }
        
        // Test addBook() method
        System.out.println("\t4. Test addBook() method:");
        Ebook.addBook(novel);
        if (!(Collections.getAllEbooks().isEmpty()) 
                && !(Collections.geteBookRatings().isEmpty())
                && !(Collections.getAllAuthors().isEmpty()
                && !(Collections.geteBookAuthorsMap().isEmpty()))){
            System.out.println("\t- method works to add new eBook");
        }else{
            System.out.println("\t- method doesn't work to add new eBook");
        }
        
        // Test getCurrentRating() method
        System.out.println("\t5. Test getCurrentRating() method:");
        if ((novel.getRating() == 0) 
                && (Ebook.getCurrentRating(novel).equals("Rating not available yet!"))){
            System.out.println("\t- method works to add rating to new eBook");
        }else{
            if (novel.getRating() == Float.parseFloat(Ebook.getCurrentRating(novel))){
                System.out.println("\t- method works to add rating to new eBook");
            }else{
                System.out.println("\t- method doesn't work to add rating to new eBook");
            }
        }  
        
        // Test addRating() method
        System.out.println("\t6. Test addRating() method:");
        Ebook.addRating(novel);
        if (!(novel.getRating() == 0)){
            System.out.println("\t- method works to add rating to new eBook");
        }else{
            System.out.println("\t- method doesn't work to add rating to new eBook");
        }
        
        // Test getBookByISBN() method
        System.out.println("\t7. Test getBookByISBN() method:"
                + "\n Please input the following ISBN when required: " + isbn);
        if (Ebook.getBookByISBN() == novel){
            System.out.println("\t- method works to get eBook by ISBN");
        }else{
            System.out.println("\t- method doesn't work to get eBook by ISBN");
        }
        
        // Test sellBook() method
        System.out.println("\t8. Test selBook() method:");
        Ebook.sellBook(novel);
        if (Collections.getSoldEbook().containsKey(novel)){
            System.out.println("\t- method works to sell eBook");
        }else{
            System.out.println("\t- method doesn't work to sell eBook");
        }
        
        // Test removeBook() method
        System.out.println("\t9. Test removeBook() method:");
        Collections.getSoldEbook().remove(novel);
        if (Collections.getSoldEbook().isEmpty()){
            System.out.println("\t- method works to remove eBook");
        }else{
            System.out.println("\t- method doesn't work to remove eBook");
        }
    }
}
