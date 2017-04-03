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
package calculator;
// Import Scanner class
import java.util.Scanner;
/**
* <h1> Implementation of a pocket calculator </h1>
* The Calculator program implements an application that will simulate 
* the usage of basic functions of a pocket calculator.
* <p> 
* <b>Note:</b> This code is a personal version for the intended/ required 
* result. Better versions to follow!
*
* @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-11-19
*/
public class Calculator {
    
    /**
     * Main method
     * Turns on the calculator, displays '0' and 
     * implements the actual usage of calculator
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("0");
        runCalculator();
    }
    
    /**
     * Creates required objects, then sets the operands,
     * the operator and displays result, depending on 
     * selected function
     */
    public static void runCalculator(){
        // Declare a String variable to hold the selected operator
        String selectedOperator;
        
        //Create Scanner object
        Scanner sc = new Scanner(System.in);
        //Create Addition 'actor'
        Addition plus = new Addition();
        //Create Result 'actor'
        Result equals = new Result();
        //Create Subtraction 'actor'
        Subtraction minus = new Subtraction();
        //Create Multiplication 'actor'
        Multiplication multiply = new Multiplication();
        //Create Division 'actor'
        Division div = new Division();
        //Create percent 'actor'
        Percent pCent = new Percent();
        
        // Read first operand
        double x = getOperand(sc);
        // Select operator
        selectedOperator = getOperator(sc);
        // Read second operand
        double y = getOperand(sc);
        
        // Compute and display result, depending on selected operator 
        switch (selectedOperator){
            case "+": {
                equals.printResult(plus.addNumbers(x, y));
                break;
            }
            case "-": {
                equals.printResult(minus.subtractNumbers(x, y));
                break;
            }
            case "*": {
                equals.printResult(multiply.multiplyNumbers(x, y));
                break;
            }
            case "/": {
                equals.printResult(div.divideNumbers(x, y));
                break;
            }
            case "%": {
                equals.printResult(pCent.percentNumbers(x, y));
                break;
            }
            default: {
                AC.treatAC(selectedOperator);
                closeCalculator(selectedOperator);
                break;
            }
        }
    }
    
    /**
      Test if any letter key [a-z] is introduced
      * and exit program if true
     * @param s
     */
    public static void closeCalculator(String s){
        if (s.matches(".*[a-z].*")){
            System.exit(0);
        }
    }
    
    /**
      Request input of operand, handle special cases
      * when AC or letter keys are introduced and return
      * double value if valid. 
     * @param sc
     * @return Double.parseDouble(z)
     */
    public static double getOperand(Scanner sc){
        System.out.println("Enter operand: ");
        String s = sc.next();
        AC.treatAC(s);
        closeCalculator(s);
        return Double.parseDouble(s);
    }
    
     /**
      Request and return an operator
      * handle special cases when anything else
      * than expected is introduced
     * @param sc
     * @return z
     */
    public static String getOperator(Scanner sc){
        System.out.println("Select operator: (please choose from: +, -, *, /, %)");
        String s = sc.next();
        AC.treatAC(s);
        closeCalculator(s);
        return s;
    }
    
}
