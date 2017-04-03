/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eLibrary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author kossT
 */
public abstract class Ebook implements Book{
    private final String ISBN;
    private final String title;
    private final int noOfPages;
    private final Set<Author> listOfAuthors;
    private double price;
    private float rating;

    public Ebook(String ISBN, String title, int noOfPages, Set<Author> listOfAuthors, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.noOfPages = noOfPages;
        this.listOfAuthors = listOfAuthors;
        this.price = price;
    }    

    public Ebook() {
        this.ISBN = setISBN();
        this.title = new ValidInput().validInput("title");
        this.noOfPages = Integer.parseInt(new ValidInput().validInput("noofpages"));
        this.listOfAuthors = new HashSet<>();
        this.price = Double.parseDouble(new ValidInput().validInput("price"));
        this.rating = 0;
    }
    
    
    @Override
    public abstract String getSubcategory();
    
    @Override
     public final String setISBN(){
         
        // ISBN will have this format: ISSN-L 2344-0732         
        double L1 = Math.random() * 10;
        double L2 = Math.random() * 10;
        double B1 = Math.random() * 10;
        double B2 = Math.random() * 10;
        double B3 = Math.random() * 10;
        double V1 = Math.random() * 10;
        double V2 = Math.random() * 10;

        // Check that L1L2 > 0  
        if ((int)L1 == 0 && (int)L2 == 0) {
            L2++;
        }
        // Check that B1B2B3 >= 100         
        if((int)B1 == 0) {
            B1++;
        }
        // Check that V1V2 > 0          
        if((int)V1 == 0 && (int)V2 == 0) {
            V2++;
        }
        // Compute check digit with hashOp method       
        double C = (hashOp((int)L1) + L2 + hashOp((int)B1) 
                + B2 + hashOp((int)B3) + V1 + hashOp((int)V2))%10;

        return "ISSN-L " + (int)L1 + (int)L2 + (int)B1 + (int)B2 + "-" 
                    + (int)B3 + (int)V1 + (int)V2 + (int)C;
    }
    
    public static int hashOp(int i){
        // used to determine C
        int doubled = 2 * i;
        if ( doubled >= 10 ) {
            doubled = doubled - 9;
        }
        return doubled;
    }
    
    
    public static void updatePrice(Ebook eb, String newPrice){
        if (!(eb == null)){
            for (Map.Entry<Ebook, List<Rating>> pair : Collections.geteBookRatings().entrySet()){
                if (eb == pair.getKey()){     
                    pair.getKey().setPrice(Double.parseDouble(newPrice));
                }
            }
            for (Map.Entry<Ebook, Set<Author>> pair : Collections.geteBookAuthorsMap().entrySet()){
                if (eb == pair.getKey()){
                    pair.getKey().setPrice(Double.parseDouble(newPrice));
                }
            }
            for (Ebook e : Collections.getAllEbooks()){
                if (e == eb){
                    e.setPrice(Double.parseDouble(newPrice));
                }
            }
            System.out.println("Price updated! Please refer to main menu "
                    + "to see list of eBooks with updated price!");
        }
        else{
            System.out.println("Add some eBooks first!");
        }
    }
    
    public static void addRating(Ebook eb){
        if (!(eb == null)){
            List<Rating> addedRatings = new ArrayList<>();
            float average;
            do{
                User user = new User();
                Rating rating = new Rating(user);
                addedRatings.add(rating);
                if (!(Collections.getAllUsers().contains(user))){
                    Collections.getAllUsers().add(user);
                }else{
                    System.out.println("Specified user already exists!");
                }                
                Collections.getUserRatings().put(user, addedRatings);
                if (!(Collections.geteBookRatings().isEmpty())){
                    for (Map.Entry<Ebook, List<Rating>> pair : Collections.geteBookRatings().entrySet()){
                        if (pair.getKey() == eb){
                            if (!(pair.getValue().isEmpty())){
                                float sum = 0;
                                for (Rating rtg : pair.getValue()){
                                    sum += rtg.getStars();
                                }
                                average = (sum + rating.getStars()) / (pair.getValue().size() + 1);
                                pair.getKey().setRating(average);
                                pair.getValue().add(rating);
                                for (Ebook e : Collections.getAllEbooks()){
                                    if (e == eb){
                                        e.setRating(average);
                                    }
                                }
                            }else{
                                Collections.geteBookRatings().put(eb, addedRatings);
                                eb.setRating(rating.getStars());
                                for (Ebook e : Collections.getAllEbooks()){
                                    if (e == eb){
                                        e.setRating(rating.getStars());
                                    }
                                } 
                            }
                        }    
                    }
                }                
                System.out.println("Add more ratings to this eBook? (y/n)");
            }while (new Functionality().checkRetry(new Functionality().getInputFromScanner()));    
        }
    }

    public static void sellBook(Ebook eb){
        if (!(eb == null)){
            for (Map.Entry<Ebook, List<Rating>> pair : Collections.geteBookRatings().entrySet()){
                if (eb == pair.getKey()){
                    Collections.getSoldEbook().put(eb, pair.getValue());
                }
            }
        removeBook(eb);
        System.out.println("eBook sold! Please refer "
                + "to main menu to check list of sold eBooks!");
        }
        
    }
    
    public static void displaySoldEbooks(){
        if (Collections.getSoldEbook().isEmpty()){
            System.out.println("No items sold yet");
        }
        else{
            System.out.println("Sold  eBooks: "
                + "\n\tDetails:\tISBN               Title"
                + "       # of pages    Price  "
                + "\n\t\t\t========================"
                + "================================");
            for (Map.Entry<Ebook, List<Rating>> pair : Collections.getSoldEbook().entrySet()){
                System.out.println("\t\t\t" + pair.getKey().getISBN() + "        "
                    + pair.getKey().getTitle() + "         " + pair.getKey().getNoOfPages() 
                    + "         " + String.format("%.2f" , (pair.getKey().getPrice())));
                for (Rating rtg : pair.getValue()){
                    System.out.print("User ID: " + rtg.getUserId() + "\nDescription: " + rtg.getDescription()
                            + "\nRated: " + rtg.getStars());
                }
            }
        }
    }

    public static void listAllAuthors(){
        if (!(Collections.getAllAuthors().isEmpty())){
            Author.displayAuthorsDetails();
        }
        else{
            System.out.println("Authors not available! "
                    + "Add some eBooks first!");
        }
        AuthorToDB.selectAuthor();
    }
    
    public static void listBookRatingDetails(Ebook eb){
        if (!(eb == null)){
            if ((Collections.geteBookRatings().isEmpty()) 
                    || (Collections.geteBookRatings().values().isEmpty())){
                System.out.println("No rating available yet for this eBook");                        
            }
            else{
                for (Map.Entry<Ebook, List<Rating>> pair : Collections.geteBookRatings().entrySet()){
                    if (pair.getKey() == eb){ 
                        if (!(pair.getValue().isEmpty())){
                            for (Rating rtg : pair.getValue()){
                                for (User user : Collections.getAllUsers()){
                                    if (rtg.getUserId() == user.getId()){
                                        System.out.println("Rated " 
                                                + String.format("%.2f" , rtg.getStars()) 
                                                + " stars by user " + user.getUsername() 
                                                + " (ID: " + user.getId() + ") \n Description: \"" 
                                                + rtg.getDescription() + "\"");
                                    }    
                                }
                            }  
                        }else{
                            System.out.println("No rating available yet for this eBook");
                        }
                    }
                }
            }     
        }
    }    
        
    public static Ebook getBookByISBN(){
        String isbn;
        do{
            if (Collections.getAllEbooks().isEmpty()){
                System.out.println("No eBooks available!");
                break;
            }else{
                listAllBooks();
                isbn = new ValidInput().validInput("isbn");       
                for (Ebook eb : Collections.getAllEbooks()){
                    if (eb.getISBN().equalsIgnoreCase(isbn)){  
                        return eb;
                    }
                }
                System.out.println("No such ISBN! Please refine your input!");
            }
        }while (new Functionality().checkRetry(new Functionality().getInputFromScanner()));
        return null;
    }      
   
    public static void listAllBooks(){
        if (!(Collections.getAllEbooks().isEmpty())){
            System.out.println("Available  eBooks: "
                    + "\n\tDetails:\t   ISBN       "
                    + "  Title        # of pages    Price   " 
                    + "Current rating"
                    + "\n\t\t\t==========================="
                    + "==================================="
                    + "===================================");
            for (Map.Entry<Ebook, Set<Author>> pair : Collections.geteBookAuthorsMap().entrySet()){
                System.out.println("\t\t\t" + pair.getKey().getISBN() + "    "
                        + pair.getKey().getTitle() + "         " + pair.getKey().getNoOfPages() 
                        + "         " + String.format("%.2f" , (pair.getKey().getPrice()))
                        + "     " + getCurrentRating(pair.getKey()));
                System.out.println("\n  List of authors:      ID    Name   Surname"
                            + "\n\t\t\t==========================="
                            + "========");
                for (Author aut : pair.getValue()){ 
                    System.out.println("\t\t\t   " + aut.getId() + "   " 
                            + aut.getName() + "     " + aut.getSurname() + "\n" );
                }
                System.out.println();
            }
        }else{
            System.out.println("No eBooks available!");
        }   
        EbookToDB.selectEbook();
    }
    
    public static void removeBook(Ebook eb){
        if (!(eb == null) ){
           Iterator<Ebook> it =  Collections.getAllEbooks().iterator();
           while (it.hasNext()){
               Ebook currentBook = it.next();
               if (currentBook == eb){
                    Iterator<Author> itAut =  Collections.getAllAuthors().iterator();
                    while (itAut.hasNext()){
                        Author currentAut = itAut.next();
                        if (eb.getListOfAuthors().contains(currentAut)){
                            itAut.remove();
                        }
                    }    
                   it.remove();
               }
            }
            Iterator<Map.Entry<Ebook, Set<Author>>> itMap =  Collections.geteBookAuthorsMap().entrySet().iterator();
            while (itMap.hasNext()){
                Map.Entry<Ebook, Set<Author>> entry = itMap.next();
                if (entry.getKey() == eb){
                        itMap.remove();
                }
            }   
            Iterator<Map.Entry<Ebook, List<Rating>>> itMapRtg =  Collections.geteBookRatings().entrySet().iterator();
            while (itMapRtg.hasNext()){
                Map.Entry<Ebook, List<Rating>> entryRtg = itMapRtg.next();
                if (entryRtg.getKey() == eb){
                    Iterator<Map.Entry<User, List<Rating>>> itMapUser =  Collections.getUserRatings().entrySet().iterator();
                    while (itMapUser.hasNext()){
                        Map.Entry<User, List<Rating>> entryUserMap = itMapUser.next();
                        for (Rating rating : entryRtg.getValue()){
                            if (entryUserMap.getKey().getId() == rating.getUserId()){
                                Iterator<User> itUser =  Collections.getAllUsers().iterator();
                                while (itUser.hasNext()){
                                    User currentUser = itUser.next();
                                    if (currentUser.getId() == entryUserMap.getKey().getId()){
                                        itUser.remove();
                                    }
                                } 
                                itMapUser.remove();
                            }
                        }
                    }
                    itMapRtg.remove();
                }
            }
            System.out.println("Successful action!");
        }
        EbookToDB.deleteEbook(eb);
    }

    public static void addBook(Ebook eb){
        Author.addAuthors(eb);
        Collections.geteBookAuthorsMap().put(eb, eb.listOfAuthors );    
        Collections.getAllEbooks().add(eb);
        Collections.geteBookRatings().put(eb, new ArrayList<>());
        Rating rt = new Rating(eb.getISBN(), Functionality.createID(), eb.rating, getCurrentRating(eb));
        RatingToDB.insertRating(eb.getISBN(), rt);
    }   

    public static String getCurrentRating(Ebook eb){
        if (eb.getRating() == 0){
            return "Rating not available yet!";
        }
        else{
            return (eb.getRating() + "");
        }
    }
    
        
    public String getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
    public int getNoOfPages() {
        return noOfPages;
    }
    public Set<Author> getListOfAuthors() {
        return listOfAuthors;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating ;
    }
       
    
}
