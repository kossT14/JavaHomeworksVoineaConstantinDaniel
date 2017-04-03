/*
 * 
 */
package ebookstore;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author kossT
 */
public class Functionality {
    private final Scanner sc = new Scanner(System.in);
    
    public String getInputFromScanner(){
        System.out.println("Please enter \"y\" to continue"
                + " or \"n\" to abort!");
        return sc.nextLine();
    }
    
    public boolean checkRetry(String input){
        boolean isAction = true;
        if (input.replaceAll("\\s+", "").equalsIgnoreCase("y")){
            isAction = true;
        }else 
            if (input.replaceAll("\\s+", "").equalsIgnoreCase("n")){
                isAction = false;
                }else {
                    System.out.println("Invalid input!Try again?");
                    checkRetry(getInputFromScanner());
                }  
        return isAction;
    }
    
    /** 
    * method used to limit description for a rating to a certain length
    * whenever specified length is exceeded, additional characters 
    * will be replaced with '...'    
    * @param value description provided as String
    * @param length max length for description
    * @return truncated description of specified length
    */
    public static String limitDescription(String value, int length){
        StringBuilder sb = new StringBuilder(value);
        if (sb.length() > length){
            sb.setLength(length);
            sb.append("...");
        }
        return sb.toString();
    } 
     
    static AtomicInteger idCounter = new AtomicInteger();
    public static int createID(){        
        return idCounter.incrementAndGet();
    }
    
}
