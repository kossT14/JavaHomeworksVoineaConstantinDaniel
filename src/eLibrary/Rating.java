/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eLibrary;

import java.util.List;
import java.util.Map;


/**
 *
 * @author kossT
 */
public class Rating {
    private final int userId;
    private final float stars;
    private final String description;
    private String isbn;

    public Rating(User user) {
        this.userId = user.getId();
        this.stars = Float.parseFloat(new ValidInput().validInput("rating"));
        this.description = new ValidInput().validInput("description");
    }
    
    public Rating(String isbn, int userId, float stars, String description){
        this.isbn = isbn;
        this.userId = userId;
        this.stars = stars;
        this.description = description;
    }
            
    public String displayRatingDetails(User user){
        if (!(user == null)){
            if (Collections.getUserRatings().isEmpty()){
                System.out.println("No ratings available! "
                        + " Please refer to main menu to add some ratings first!");
            }
            else{
                for (Map.Entry<User, List<Rating>> pair : Collections.getUserRatings().entrySet()){
                    if (user == pair.getKey()){
                        for (Rating rtg : pair.getValue()){
                            return ("Rated" + rtg.getStars() + " stars by user " 
                                + user.getUsername() + " (ID: " + user.getId()
                                + ") \n Description: \"" + rtg.getDescription() + "\""); 
                        }
                    }
                }
            }    
        }    
        return "No such user!";
    }   
    public float getStars() {
        return stars;
    }

    public String getDescription() {
        return description;
    }

    public int getUserId() {
        return userId;
    }
    
    
}
