/*
 * Class implementation used to demonstrate good practice
 * when writing code inside try-catch block
 */
package exceptions;

import java.util.Scanner;

/**
* @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-12-30
*/
public class ExceptionsNotUsedForFlowControl {
    
    public static void main (String[] args){
        ExceptionsNotUsedForFlowControl test = new ExceptionsNotUsedForFlowControl();
        test.display();
    }
    
    //bad
    /*boolean verifyCnp(String cnp){
        try {
            char s = cnp.charAt(0);
            //more code to verify
        }catch (NullPointerException | IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("cnp should be exactly 13 digits long");
        }
    }*/
    
    //good
    boolean verifyCnp(String cnp){
        Boolean isValid = true;
        if(cnp == null || cnp.length() != 13) {
            throw new IllegalArgumentException("cnp should be "
                            + "exactly 13 digits long");
        }
        char s = cnp.charAt(0);
        if (s == '0') {
            isValid = false;
        }    
        return isValid;
    }
    void display(){
        if ( verifyCnp(provideCnp()) ){
            System.out.println("Provided CNP is valid.");
        }else{
            System.out.println("Provided CNP is invalid.");
        }
    }    
    
    String provideCnp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input CNP:     "
                    + "(provide 13 figures exactly!)");
        return sc.nextLine();
    }
}
