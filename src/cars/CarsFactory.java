
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

package cars;

import java.util.ArrayList;
import java.util.Scanner;

/**
* <h1> Implementation of a car factory </h1>
* The CarFactory program implements an application that will simulate 
* the activity of a car factory. On demand, this car factory will 
* create and deliver a car with specified attributes, then will display 
* a list of all cars delivered.
* <p> 
* <b>Note:</b> This code is a personal version for the intended/ required 
* result. Better versions to follow!
*
* @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-12-08
*/
public class CarsFactory {
    // Create a list of delivered cars
    ArrayList<Car> deliveredCars = new ArrayList();
    // Use of a Scanner object to get input from user  
    Scanner sc = new Scanner(System.in);  
    
    // Return input from user for car name 
    public String inputName(){
        System.out.println("Please choose from available producers: "
                            + "DACIA, MERCEDES, RENAULT");
        return sc.next();
    }
    
    // Check if specified name is valid 
    public boolean isValidName(String s){
        boolean isValid = false;
        for (Car.Name n : Car.Name.values()){
            if (s.equalsIgnoreCase(n.name())){
                isValid = true;
            }
        }   
        return isValid;
    }
              
    // Method used to get a valid input for car name
    // It repeats taking input from user until input is valid name
    // or terminates app on retry, if option is "no" or undefined.
    public String validName(){
        String inputName;
        inputName = inputName();
        while (!isValidName(inputName)){
            System.out.println("Invalid name, try again? (y/n)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("y")){
                inputName = inputName();
                }else{
                    if (answer.equalsIgnoreCase("n")){
                        System.exit(0); // user choses "no", app will terminate
                        }else{
                        // Invalid option, app will terminate    
                        System.out.println("Not a valid option! Please re-run "
                                        + "program to make another request!");
                        System.exit(0);
                        }
                    }
            
        }
        return inputName;
    }
    
    // Return input from user for car color
    public String inputColor(){
        System.out.println("Please choose from available colors: "
                            + "WHITE, RED, GREEN, BLUE, MAGENTA, YELLOW ");
        return sc.next();
    }
    
    // Check if specified color is valid
    public boolean isValidColor(String s){
        boolean isValid = false;
        for (Car.Color c : Car.Color.values()){
            if (s.equalsIgnoreCase(c.name())){
                isValid = true;
            }
        }    
        return isValid;
    }  
           
    // Method used to get a valid input for car color
    // It repeats taking input from user until input is valid color
    // or terminates app on retry, if option is "no" or undefined.
    public String validColor(){
        String inputColor;
        inputColor = inputColor();
        while (!isValidColor(inputColor)){
            System.out.println("Invalid color, try again? (y/n)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("y")){
                inputColor = inputColor();
                }else{
                    if (answer.equalsIgnoreCase("n")){
                        System.exit(0);// user choses "no", app will terminate
                    }else{
                        // Invalid option, app will terminate   
                        System.out.println("Not a valid answer! Please re-run "
                                        + "program to make another request!");
                        System.exit(0);
                    }
                }
        }
        return inputColor;
    }    
    
    // Method used to create a new car for specified valid attributes 
    // and continue the algorithm of delivering current car, 
    // displaying the entire list of delivered cars 
    // and asking for other requests
    public void createNewCar(){
        String validName = validName(); // specified valid name
        String validColor = validColor(); // specified valid color
        // Create requested car with specified attributes
        Car requestedCar = new Car(validName, validColor);
        // Display current car being delivered
        displayCurrentDelivery(requestedCar);
        // Add last delivered car to the list of all delivered cars
        appendListOfDeliveredCars(requestedCar);  
        // Display the list of all delivered cars so far
        displayListOfDeliveredCars();
        // Check for other requests
        checkForRequest();
    }
    
    // Method used to check for other requests
    public void checkForRequest(){
        System.out.println("Do you want to make a new request? (y/n)");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("y")){
            createNewCar();
        }else{
            if (answer.equalsIgnoreCase("n")){
            System.exit(0); // no requests so app terminates
            }else{
                // Not an option(yes or no), app will terminate
                System.out.println("Not a valid option! Please re-run "
                            + "program to make another request!");
                System.exit(0);
            }
        }
    }
        
    // Add a car on the list of delivered cars
    public void appendListOfDeliveredCars(Car c){
        deliveredCars.add(c);
    }
    
    // Display the current car being delivered
    public void displayCurrentDelivery(Car c){
        System.out.println("A new " + c.getColor() + " " + c.getName() 
                + " was delivered!" );
    }
    
    // Display the whole list of delivered cars
    public void displayListOfDeliveredCars(){
        System.out.println("No. Car name    Car color"
                + "\n=========================");
        for (int i = 0; i < deliveredCars.size(); i++){
            System.out.println((i+1) + ".  " + deliveredCars.get(i).getName() 
                    + "      " + deliveredCars.get(i).getColor());
        }
    }
    
    
    /**
     * Will test the implementation of all involved classes
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CarsFactory factory = new CarsFactory();
      // First explicit request: a red Mercedes car
      Car newCar = new Car(Car.Name.MERCEDES, Car.Color.RED);
      // Display of current car created and delivered
      factory.displayCurrentDelivery(newCar);
      // Current delivered car added to a list of delivered cars
      factory.appendListOfDeliveredCars(newCar);
      // Display all cars delivered so far
      factory.displayListOfDeliveredCars();
      // Ask for other requests
      factory.checkForRequest();
    }
}