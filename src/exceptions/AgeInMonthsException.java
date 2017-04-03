/*
 * Class implementation demonstrates use of try-catch blocks
 */
package exceptions;

import java.util.Scanner;

/**
* @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-12-30
*/
public class AgeInMonthsException {
    
    public static void main(String[] args) {
        
        try {
            // command line args
            ageInMonths(Integer.parseInt(args[0]));
        }catch (NumberFormatException e) {
             System.out.println("first program argument needs to be an int");
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Please enter your age (> 0 !)");
            Scanner sc = new Scanner(System.in);
            System.out.println("Your age in months is: " + ageInMonths(sc.nextInt()));
            
        }
    }
    
    /** method used to return age in months
    * handles exception if inputted age is < 0
    * 
    */
    static int ageInMonths(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age should be >= 0");
        }
        return age * 12;
    } 
}
