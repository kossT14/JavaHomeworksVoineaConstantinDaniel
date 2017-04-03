/* This code is free software; you can redistribute it and/or modify it
* without prior notice.
*
* This code is distributed in the hope that it will be useful, but without
* any warranty or fitness for a particular purpose. 
*
* Please contact user kossT14 on GitHub 
* https://github.com/kossT14/JavaHomeworksVoineaConstantinDaniel.git 
* if you need additional information or have any questions.
*/
package ReadName;
import java.util.Scanner;
/**
* <h1> Read from keyboard and write in console!</h1>
* The ReadName program implements an application that will ask the user to
* input his name from keyboard, then will display it in console.
* <p> 
* <b>Note:</b> This code is a personal version for the intended/ required 
* result. Better versions to follow!
*
* @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-11-10
*/
public class ReadName {
    public static void main(String[] args){
        //Instantiate Scanner class to allow the user to input data
        Scanner sc = new Scanner(System.in);
        //Print in console required action from user
        System.out.println("Enter your name: ");
        //Read name from keyboard and store it in a String object
        String name = sc.nextLine();
        //Print a message in console including provided information
        System.out.println("Your name is: " + name);
    }
}
