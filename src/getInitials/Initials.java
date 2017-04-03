
/*
 * Implementation of class Initials
 * which compute initials from an inputted full name
 */
package getInitials;

import java.util.Scanner;
/**
 @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-12-13
 */

public class Initials{
        
    
    public static void main(String[] args){
        // Create an instance for test purpose
        Initials test = new Initials();
        test.start();
    }

    
    // Groups all the methods used for computing 
    // and displaying initials from inputted full name 
    private void start(){
        showResult(getInitials(seperateFullName(askInput())));
    }

    // Method used to get input from user
    private String askInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name: ");
        return sc.nextLine();
    }

    // Method used for getting names from inputted full name  
    // and adding them to an array of names 
    // by splitting them where space characters exist  
    private String[] seperateFullName(String fullName){
        String[] names = new String[10]; // Limitation to a 10-element full name
        try{
            names = fullName.split(" ");
        }
        // Catching an exception if invalid input and restart app
        catch (StringIndexOutOfBoundsException e){ 
            System.out.println("Invalid input!");
            start();
        }
        return names;
    }
    
    // Method user for getting initials from computed array of names
    private String[] getInitials(String[] s){
        String[] initials = new String[10];
        for (int i = 0; i < s.length; i++){
            initials[i] = s[i].charAt(0) + ". ";  
        }
        return initials;
    }

    // Method used for displaying computed initials
    private void showResult(String[] s){
        System.out.println("Your initials are: ");
        for (String item : s) {
            if (!(item == null)){
            System.out.print(item);
            }
        }
    }
          
}

