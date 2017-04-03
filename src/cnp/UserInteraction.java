/*
 * UseInteraction class
 */
package cnp;

import java.util.Scanner;

/**
 * Implementation of methods user for interaction with user
 * @author kossT
 */
public class UserInteraction {
    private final Scanner sc = new Scanner(System.in);
    
    String getCnpFromScanner(){
        System.out.println("Please enter CNP: ");
        return sc.nextLine().replaceAll("\\s+", "");
    }
    
    private String getRetryFromScanner(){
        System.out.println("CONTINUE ? "
                + "\nPlease enter \"y\" for \"yes\" or \"n\" for \"no\":");
        return sc.nextLine().replaceAll("\\s+", "");
    }
    
    boolean checkRetry(){
        String response = getRetryFromScanner().replaceAll("\\s+", "");
        boolean isAction = true;
        if (response.equalsIgnoreCase("y")){
            isAction = true;
        }else 
            if (response.equalsIgnoreCase("n")){
                isAction = false;
                }else {
                    System.out.println("Invalid input!");
                    checkRetry();
                }  
        return isAction;
    }  
}
