/*
 * Implementation of class FullNameInitials
 * which displays initials from full name
 */
package fullnameinitials;

import java.util.ArrayList;
import java.util.Scanner;

/**
 @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-12-13
 */
public class FullNameInitials {
    
    //  Class String variables used to retain 
    // initials for first name and last name
    private static String firstInitial, lastInitial;
    
    // ArrayList used for an undefined number of middlenames
    private static ArrayList<String>  middleInitial;
       
    
    
    /**
     * Will test the implementation of FullNameInitials class
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        // Create an instance for test purpose 
        FullNameInitials test = new FullNameInitials();
        test.start();
    }
    
    
    
    // Groups all the methods used for computing 
    // and displaying initials from inputted full name 
    private void start(){
        getInitials(getNamesFromInput(getInputName()));
        displayInitials();
    }
    
    // Method used to get valid input from user
    private String getInputName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name as: "
                        + "First name, Middle name(s), Last name");
        
        String input = sc.nextLine();
        if (!(checkIfValidName(input))){ // If not valid input, ask for retry 
            System.out.println("Invalid input! Retry? (y/n)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("y")){
                input = getInputName();
            }else{ // Terminate execution if answer is other than "y" (= "ýes")
                System.out.println("Invalid input! Restart app!");
                System.exit(0);
            }
        }
        return input;
    }
    
    // 
    public boolean checkIfValidName(String s){
        
        // Suppose input to be checked is valid        
        boolean isValid = true;
        
        // Consider input as an array of chars
        // and iterate over its values
        for (char c : s.toCharArray()) {
            // Input of characters other than letters or spaces
            // is considered invalid input
            if ( !( (Character.isLetter(c)) 
                    || (Character.isWhitespace(c)) ) ) {
                isValid = false;
            }
        }
        return (isValid) ;
    }
    
    // Method used to extract all names and store them
    private ArrayList<String> getNamesFromInput(String inputName){
        
        // Unknown no of names, so use an ArrayList
        ArrayList<String> allNames = new ArrayList();
        
        // Local String variables used for special purposes
        String name,s;
        
        try{
            while (!(inputName.equals(""))){
                // Var s used to retain inputName
                // without leading and trailing spaces
                s = inputName.trim();
                // If statement used to avoid error when only last name 
                // remains to be added (else branch)
                if (s.contains(" ")){
                    name = s.substring(0, s.indexOf(" "));
                }else{
                    name = s.substring(0);
                }
                allNames.add(name);
                
                // Once leftmost word/name was added to list of names,
                // it is removed from initial input
                inputName = s.substring(name.length());
            } 
            
        }   
        catch (StringIndexOutOfBoundsException e){ // Add an exception
            System.out.println("Invalid input! Restart app!");
            System.exit(0);
        }
        return allNames;
    }
    
    // Method used for getting initials from names stored in a list
    private void getInitials(ArrayList<String> listOfNames){
        middleInitial = new ArrayList();
        // Initial of first name is first element on list
        firstInitial = listOfNames.get(0).charAt(0) + ". ";
        // Initial of las name is last element on list
        lastInitial = listOfNames.get(listOfNames.size() - 1).charAt(0) + ". ";
        // Iterate over the rest of elements 
        // to retain initials of middle names in a list
        for (int i = 1; i < (listOfNames.size()- 1); i++){
           middleInitial.add(listOfNames.get(i).charAt(0) + ". "); 
        }
    }
    
    // Method used for displaying computed initials
    public void displayInitials(){
        System.out.print("Your initials are: " + firstInitial);
        for (String element : middleInitial){
            System.out.print(element);
        }
        System.out.print(lastInitial);
    }   
    
    
}
        
