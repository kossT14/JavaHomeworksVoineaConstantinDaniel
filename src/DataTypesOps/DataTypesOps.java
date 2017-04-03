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
package DataTypesOps;
import java.util.Scanner;
/**
* <h1> Understanding how operators work!</h1>
* The DataTypesOps program implements an application that will display 
* all possible operators that can apply to primitive data types, 
* wrapper classes of primitive data types and String objects.
* <p> 
* <b>Note:</b> This code is a personal version for the intended/ required 
* result. Better versions to follow!
*
* @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-11-10
*/
public class DataTypesOps {
    public static void main(String[] args){
        /* This method allows the user to choose a particular data type, in order
        * to display the operators that can be applied. Depending on this input,
        * appropriate method will run and will display operators available.      
        */
        readType();
    }      
    static void readType(){
        //Print in console available data types to choose from
        System.out.println("Please select data type: (choose from byte, short, int, "
                            + "long, float, double, char, boolean, Byte, Short, Integer,"
                            + " Long, Float, Double, Character, Boolean, String)");
        //Instantiate a Scanner class that will allow the user to input data
        Scanner sc = new Scanner(System.in);
        //Create a String object that stores the input provided
        String answer = sc.nextLine();
        /*Use switch statement to choose from multiple execution paths, depending
        * on user input, stored in 'answer' String object. Default case provides
        * the user the occasion to retry to input the appropriate data required.
        */
        switch (answer){
            case "byte": {
                System.out.println("Operators that apply to byte variables:");
                byteVar();
                break;
            }
            case "short": {
                System.out.println("Operators that apply to short variables:");
                shortVar();
                break;
            }
            case "int": {
                System.out.println("Operators that apply to int variables:");
                intVar();
                break;
            }
            case "long": {
                System.out.println("Operators that apply to long variables:");
                longVar();
                break;
            }
            case "float": {
                System.out.println("Operators that apply to float variables:");
                floatVar();
                break;
            }
            case "double": {
                System.out.println("Operators that apply to double variables:");
                doubleVar();
                break;
            }
            case "char": {
                System.out.println("Operators that apply to char variables:");
                charVar();
                break;
            }
            case "boolean": {
                System.out.println("Operators that apply to boolean variables:");
                booleanVar();
                break;
            }
            case "String": {
                System.out.println("Operators that apply to String variables:");
                stringVar();
                break;
            }
            case "Byte": {
                System.out.println("Operators that apply to instance variables of class Byte:");
                byteWrapper();
                break;
            }
            default: {
                System.out.println("None of the above selected! Please pay attention to upper/ lower case typing! Try again? (y/n) ");
                String retry = sc.nextLine();
                if (retry.equalsIgnoreCase("y")) {
                    //Re-run the method, as selected
                    readType();
                }else{
                    if (retry.equalsIgnoreCase("n")) {
                        //Stop the execution, as selected  
                        break;
                    }else{
                        //Inappropriate input! Execution will end with the provided message.
                        System.out.println("Inappropriate input! Please re-run the program, if needed!");
                        break;
                    }
                }
            }    
        }        
    }
    static void byteVar(){        
        byte a, b;
        a = 10;
        b = 3;
        System.out.println("Considering 2 byte variables a = 10 and b = 3, we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: \n");
       
            //Assignment operators
            System.out.println("Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + b);
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: a <<= 2 equivalent to a = a << 2 => a = " + a + " << 2 " + " = " + (a << 2) );
            System.out.println("\t *Right shift AND assignment operator: a &= 2 equivalent to a = a & 2 => a = " + a + " & 2 " + " = " + (a & 2) );
            System.out.println("\t *Bitwise AND assignment operator: a >>= 2 equivalent to a = a >> 2 => a = " + a + " >> 2 = " + (a >> 2) );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: a |= 2 equivalent to a = a | 2 => a = " + a + " | 2 = " + (a | 2) );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: a ^= 2 equivalent to a = a ^ 2 => a = " + a + " ^ 2 = " + (a ^ 2));
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator (indicates positive value): " + a + " = +" + a);        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if (a == b){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if (a != b){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for 2 variables a = " + a + " and b = " + b + " :");
            if ( (a == 10) && (b == 3) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 10 AND b is 3 \" evaluates to TRUE");
            }
            if ( (a == 10) || (b == 10) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 10 OR b is 10\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for 2 variables a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a==b) ? a : b) );
        
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
            
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators applied to a byte variable a = 10 (" + (Integer.toBinaryString(a)) + " in binary) : " );   
        System.out.println("\t *Unary bitwise complement: ~a = " + (~a) + " (" + (Integer.toBinaryString(~a)) + " in binary) : " );
        System.out.println("\t *Bit shift operators: ");    
        System.out.println("\t \t *Signed left shift 2 places: a << 2 = " + (a << 2) + " (" + (Integer.toBinaryString(a << 2)) + " in binary) : " );
        System.out.println("\t \t *Signed right shift 2 places: a >> 2 = " + (a >> 2) + " (" + (Integer.toBinaryString(a >> 2)) + " in binary) : " );
        System.out.println("\t \t *Unsigned right shift 2 places: a >>> 2 = " + (a >>> 2) + " (" + (Integer.toBinaryString(a >>> 2)) + " in binary) : " );
        System.out.println("\t *Bitwise AND: a & b equivalent to " + a + " & " + b + " = " + (a & b) + " (" + (Integer.toBinaryString(a & b)) + " in binary) : " );
        System.out.println("\t *Bitwise exclusive OR: a ^ b equivalent to " + a + " ^ " + b + " = " + (a ^ b) + " (" + (Integer.toBinaryString(a ^ b)) + " in binary) : " );
        System.out.println("\t *Bitwise inclusive OR: a | b equivalent to " + a + " | " + b + " = " + (a | b) + " (" + (Integer.toBinaryString(a | b)) + " in binary) : \n" );
}
    static void shortVar(){        
        short a, b;
        a = 50;
        b = 7;
        System.out.println("Considering 2 short variables a = 50 and b = 7, we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: \n");
       
            //Assignment operators
            System.out.println("Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + b);
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: a <<= 2 equivalent to a = a << 2 => a = " + a + " << 2 " + " = " + (a << 2) );
            System.out.println("\t *Right shift AND assignment operator: a &= 2 equivalent to a = a & 2 => a = " + a + " & 2 " + " = " + (a & 2) );
            System.out.println("\t *Bitwise AND assignment operator: a >>= 2 equivalent to a = a >> 2 => a = " + a + " >> 2 = " + (a >> 2) );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: a |= 2 equivalent to a = a | 2 => a = " + a + " | 2 = " + (a | 2) );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: a ^= 2 equivalent to a = a ^ 2 => a = " + a + " ^ 2 = " + (a ^ 2));
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator (indicates positive value): " + a + " = +" + a);        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if (a == b){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if (a != b){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for 2 variables a = " + a + " and b = " + b + " :");
            if ( (a == 50) && (b == 7) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 50 AND b is 7 \" evaluates to TRUE");
            }
            if ( (a == 50) || (b == 50) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 50 OR b is 50\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for 2 variables a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a==b) ? a : b) );
        
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
            
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators applied to a byte variable a = 50 (" + (Integer.toBinaryString(a)) + " in binary) : " );   
        System.out.println("\t *Unary bitwise complement: ~a = " + (~a) + " (" + (Integer.toBinaryString(~a)) + " in binary) : " );
        System.out.println("\t *Bit shift operators: ");    
        System.out.println("\t \t *Signed left shift 2 places: a << 2 = " + (a << 2) + " (" + (Integer.toBinaryString(a << 2)) + " in binary) : " );
        System.out.println("\t \t *Signed right shift 2 places: a >> 2 = " + (a >> 2) + " (" + (Integer.toBinaryString(a >> 2)) + " in binary) : " );
        System.out.println("\t \t *Unsigned right shift 2 places: a >>> 2 = " + (a >>> 2) + " (" + (Integer.toBinaryString(a >>> 2)) + " in binary) : " );
        System.out.println("\t *Bitwise AND: a & b equivalent to " + a + " & " + b + " = " + (a & b) + " (" + (Integer.toBinaryString(a & b)) + " in binary) : " );
        System.out.println("\t *Bitwise exclusive OR: a ^ b equivalent to " + a + " ^ " + b + " = " + (a ^ b) + " (" + (Integer.toBinaryString(a ^ b)) + " in binary) : " );
        System.out.println("\t *Bitwise inclusive OR: a | b equivalent to " + a + " | " + b + " = " + (a | b) + " (" + (Integer.toBinaryString(a | b)) + " in binary) : \n" );
    }
        static void intVar(){        
        int a, b;
        a = 100;
        b = 19;
        System.out.println("Considering 2 int variables a = 100 and b = 19, we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: \n");
       
            //Assignment operators
            System.out.println("Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + b);
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: a <<= 2 equivalent to a = a << 2 => a = " + a + " << 2 " + " = " + (a << 2) );
            System.out.println("\t *Right shift AND assignment operator: a &= 2 equivalent to a = a & 2 => a = " + a + " & 2 " + " = " + (a & 2) );
            System.out.println("\t *Bitwise AND assignment operator: a >>= 2 equivalent to a = a >> 2 => a = " + a + " >> 2 = " + (a >> 2) );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: a |= 2 equivalent to a = a | 2 => a = " + a + " | 2 = " + (a | 2) );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: a ^= 2 equivalent to a = a ^ 2 => a = " + a + " ^ 2 = " + (a ^ 2));
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator (indicates positive value): " + a + " = +" + a);        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if (a == b){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if (a != b){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for 2 variables a = " + a + " and b = " + b + " :");
            if ( (a == 100) && (b == 19) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 100 AND b is 19 \" evaluates to TRUE");
            }
            if ( (a == 100) || (b == 100) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 100 OR b is 100\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for 2 variables a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a==b) ? a : b) );
        
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
            
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators applied to a byte variable a = 100 (" + (Integer.toBinaryString(a)) + " in binary) : " );   
        System.out.println("\t *Unary bitwise complement: ~a = " + (~a) + " (" + (Integer.toBinaryString(~a)) + " in binary) : " );
        System.out.println("\t *Bit shift operators: ");    
        System.out.println("\t \t *Signed left shift 2 places: a << 2 = " + (a << 2) + " (" + (Integer.toBinaryString(a << 2)) + " in binary) : " );
        System.out.println("\t \t *Signed right shift 2 places: a >> 2 = " + (a >> 2) + " (" + (Integer.toBinaryString(a >> 2)) + " in binary) : " );
        System.out.println("\t \t *Unsigned right shift 2 places: a >>> 2 = " + (a >>> 2) + " (" + (Integer.toBinaryString(a >>> 2)) + " in binary) : " );
        System.out.println("\t *Bitwise AND: a & b equivalent to " + a + " & " + b + " = " + (a & b) + " (" + (Integer.toBinaryString(a & b)) + " in binary) : " );
        System.out.println("\t *Bitwise exclusive OR: a ^ b equivalent to " + a + " ^ " + b + " = " + (a ^ b) + " (" + (Integer.toBinaryString(a ^ b)) + " in binary) : " );
        System.out.println("\t *Bitwise inclusive OR: a | b equivalent to " + a + " | " + b + " = " + (a | b) + " (" + (Integer.toBinaryString(a | b)) + " in binary) : \n" );
}
        
    static void longVar(){        
        long a, b;
        a = 2500;
        b = 30;
        System.out.println("Considering 2 long variables a = 2500 and b = 30, we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: \n");
       
            //Assignment operators
            System.out.println("Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + b);
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: a <<= 2 equivalent to a = a << 2 => a = " + a + " << 2 " + " = " + (a << 2) );
            System.out.println("\t *Right shift AND assignment operator: a &= 2 equivalent to a = a & 2 => a = " + a + " & 2 " + " = " + (a & 2) );
            System.out.println("\t *Bitwise AND assignment operator: a >>= 2 equivalent to a = a >> 2 => a = " + a + " >> 2 = " + (a >> 2) );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: a |= 2 equivalent to a = a | 2 => a = " + a + " | 2 = " + (a | 2) );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: a ^= 2 equivalent to a = a ^ 2 => a = " + a + " ^ 2 = " + (a ^ 2));
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator (indicates positive value): " + a + " = +" + a);        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if (a == b){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if (a != b){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for 2 variables a = " + a + " and b = " + b + " :");
            if ( (a == 2500) && (b == 30) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 2500 AND b is 30 \" evaluates to TRUE");
            }
            if ( (a == 2500) || (b == 2500) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 2500 OR b is 2500\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for 2 variables a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a==b) ? a : b) );
        
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
            
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators applied to a long variable a = 2500 (" + (Long.toBinaryString(a)) + " in binary) : " );   
        System.out.println("\t *Unary bitwise complement: ~a = " + (~a) + " (" + (Long.toBinaryString(~a)) + " in binary) : " );
        System.out.println("\t *Bit shift operators: ");    
        System.out.println("\t \t *Signed left shift 2 places: a << 2 = " + (a << 2) + " (" + (Long.toBinaryString(a << 2)) + " in binary) : " );
        System.out.println("\t \t *Signed right shift 2 places: a >> 2 = " + (a >> 2) + " (" + (Long.toBinaryString(a >> 2)) + " in binary) : " );
        System.out.println("\t \t *Unsigned right shift 2 places: a >>> 2 = " + (a >>> 2) + " (" + (Long.toBinaryString(a >>> 2)) + " in binary) : " );
        System.out.println("\t *Bitwise AND: a & b equivalent to " + a + " & " + b + " = " + (a & b) + " (" + (Long.toBinaryString(a & b)) + " in binary) : " );
        System.out.println("\t *Bitwise exclusive OR: a ^ b equivalent to " + a + " ^ " + b + " = " + (a ^ b) + " (" + (Long.toBinaryString(a ^ b)) + " in binary) : " );
        System.out.println("\t *Bitwise inclusive OR: a | b equivalent to " + a + " | " + b + " = " + (a | b) + " (" + (Long.toBinaryString(a | b)) + " in binary) : \n" );
}   
    
    static void charVar(){        
        char a, b;
        a = 'A';
        b = 'B';
        System.out.println("Considering 2 char variables a = 'A' (int value = " + Character.getNumericValue(a) + " ) and b = 'B' "
                            + "(int value = " + Character.getNumericValue(b) + " ), we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: ");
       
            //Assignment operators
            System.out.println("\t Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + "'" + b + " '");
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: a <<= 2 equivalent to a = a << 2 => a = " + a + " << 2 " + " = " + (a << 2) );
            System.out.println("\t *Right shift AND assignment operator: a &= 2 equivalent to a = a & 2 => a = " + a + " & 2 " + " = " + (a & 2) );
            System.out.println("\t *Bitwise AND assignment operator: a >>= 2 equivalent to a = a >> 2 => a = " + a + " >> 2 = " + (a >> 2) );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: a |= 2 equivalent to a = a | 2 => a = " + a + " | 2 = " + (a | 2) );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: a ^= 2 equivalent to a = a ^ 2 => a = " + a + " ^ 2 = " + (a ^ 2));
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator: indicates positive value of a ");        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if (a == b){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if (a != b){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for 2 variables a = " + a + " and b = " + b + " :");
            if ( (a == 'A') && (b == 'B') ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 'A' AND b is 'B' \" evaluates to TRUE");
            }
            if ( (a == 'A') || (b == 'A') ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 'A' OR b is 'A'\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for 2 variables a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a==b) ? a : b) );
        
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
            
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators applied to a char variable a = 'A' (" + (Integer.toBinaryString(a)) + " in binary) : " );   
        System.out.println("\t *Unary bitwise complement: ~a = " + (~a) + " (" + (Integer.toBinaryString(~a)) + " in binary) : " );
        System.out.println("\t *Bit shift operators: ");    
        System.out.println("\t \t *Signed left shift 2 places: a << 2 = " + (a << 2) + " (" + (Integer.toBinaryString(a << 2)) + " in binary) : " );
        System.out.println("\t \t *Signed right shift 2 places: a >> 2 = " + (a >> 2) + " (" + (Integer.toBinaryString(a >> 2)) + " in binary) : " );
        System.out.println("\t \t *Unsigned right shift 2 places: a >>> 2 = " + (a >>> 2) + " (" + (Integer.toBinaryString(a >>> 2)) + " in binary) : " );
        System.out.println("\t *Bitwise AND: a & b equivalent to " + a + " & " + b + " = " + (a & b) + " (" + (Integer.toBinaryString(a & b)) + " in binary) : " );
        System.out.println("\t *Bitwise exclusive OR: a ^ b equivalent to " + a + " ^ " + b + " = " + (a ^ b) + " (" + (Integer.toBinaryString(a ^ b)) + " in binary) : " );
        System.out.println("\t *Bitwise inclusive OR: a | b equivalent to " + a + " | " + b + " = " + (a | b) + " (" + (Integer.toBinaryString(a | b)) + " in binary) : \n" );
    }
    
    static void floatVar(){        
        float a, b;
        a = 1000.5f;
        b = 20.5f;
        System.out.println("Considering 2 float variables a = 1000.5 and b = 20.5, we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: \n");
       
            //Assignment operators
            System.out.println("Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + b);
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: available only for integral types! " );
            System.out.println("\t *Right shift AND assignment operator: available only for integral types! " );
            System.out.println("\t *Bitwise AND assignment operator: available only for integral types! " );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: available only for integral types! " );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: available only for integral types! ");
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator (indicates positive value): " + a + " = +" + a);        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if (a == b){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if (a != b){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for 2 variables a = " + a + " and b = " + b + " :");
            if ( (a == 1000.5f) && (b == 20.5f) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 1000.5 AND b is 20.5 \" evaluates to TRUE");
            }
            if ( (a == 1000.5f) || (b == 1000.5f) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 1000.5 OR b is 1000.5\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for 2 variables a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a==b) ? a : b) );
        
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
            
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators:  available only for integral types! " );   
    }

    
    static void doubleVar(){        
        double a, b;
        a = 1000.55D;
        b = 20.55D;
        System.out.println("Considering 2 double variables a = 1000.55 and b = 20.55, we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: \n");
       
            //Assignment operators
            System.out.println("Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + b);
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: available only for integral types! " );
            System.out.println("\t *Right shift AND assignment operator: available only for integral types! " );
            System.out.println("\t *Bitwise AND assignment operator: available only for integral types! " );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: available only for integral types! " );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: available only for integral types! ");
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator (indicates positive value): " + a + " = +" + a);        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if (a == b){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if (a != b){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for 2 variables a = " + a + " and b = " + b + " :");
            if ( (a == 1000.55D) && (b == 20.55D) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 1000.55 AND b is 20.55 \" evaluates to TRUE");
            }
            if ( (a == 1000.55D) || (b == 1000.55D) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 1000.55 OR b is 1000.55\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for 2 variables a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a==b) ? a : b) );
        
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
            
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators:  available only for integral types! " );   
    }
    
    static void booleanVar(){        
        boolean isTrue, isFalse;
        isTrue = true;
        isFalse = false;
        System.out.println("Considering 2 boolean variables isTrue = 'true' and isFalse = 'false', we will have: ");
        
        //Assignment operators
        System.out.println("\n Assignment operators: ");
        System.out.println("\t *The simple assignment operator: isTrue = isFalse" + " equivalent to " + "isTrue = " + isFalse);
                
        //Equality and conditional operators
        System.out.println("\n Equality and conditional operators: " );    
        
            //The equality operators
            System.out.println("\t *Equality operators - compare 2 values isTrue = " + isTrue + " and isFalse = " + isFalse + " :"); 
            if (isTrue == isFalse){
                System.out.println("\t \t isTrue == isFalse");
            }else{
                System.out.println("\t \t 'isTrue == isFalse' has the logical value of 'false' ");
            }
            if (isTrue != isFalse){
                System.out.println("\t \t isTrue != isFalse");
            }else{
                System.out.println("\t \t 'isTrue != isFalse' has the logical value of 'false' ");
            }
           
            //The conditional operators
            System.out.println("\t *The conditional operators - for 2 variables isTrue = " + isTrue + " and isFalse = " + isFalse + " :");
            if ( (isTrue == true) && (isFalse == false) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"isTrue is 'true' AND isFalse is 'false' \" evaluates to TRUE");
            }
            if ( (isTrue == true) || (isFalse == true) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"isTrue is 'true' OR isFalse is 'true' \" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator - for 2 boolean variables isTrue = " + isTrue + " and isFalse = " + isFalse + " will evaluate the condition"
                                + " (isTrue == isFalse) and will return the value of isTrue if condition is 'true' or the value of isFalse if condition is 'false'");
            System.out.println("\t \t \t result = " + ((isTrue == isFalse) ? isTrue : isFalse) );
        
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
            
        //Logical operators
        System.out.println("\n Logical operators applied to boolean variables isTrue = true and isFalse = false : " );
        System.out.println("\t *Logical complement: !isTrue = " + (!(isTrue)) );
        System.out.println("\t *Logical AND: isTrue & isFalse equivalent to " + isTrue + " & " + isFalse + " = " + (isTrue & isFalse) );
        System.out.println("\t *Logical exclusive OR: isTrue ^ isFalse equivalent to " + isTrue + " ^ " + isFalse + " = " + (isTrue ^ isFalse)  );
        System.out.println("\t *Logical inclusive OR: isTrue | isFalse equivalent to " + isTrue + " | " + isFalse + " = " + (isTrue | isFalse)  );
    }
    
    static void byteWrapper(){        
        Byte a, b;
        a = 10;
        b = 3;
        System.out.println("Considering 2 Byte instance variables a = 10 and b = 3, we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: \n");
       
            //Assignment operators
            System.out.println("Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + b);
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: a <<= 2 equivalent to a = a << 2 => a = " + a + " << 2 " + " = " + (a << 2) );
            System.out.println("\t *Right shift AND assignment operator: a &= 2 equivalent to a = a & 2 => a = " + a + " & 2 " + " = " + (a & 2) );
            System.out.println("\t *Bitwise AND assignment operator: a >>= 2 equivalent to a = a >> 2 => a = " + a + " >> 2 = " + (a >> 2) );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: a |= 2 equivalent to a = a | 2 => a = " + a + " | 2 = " + (a | 2) );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: a ^= 2 equivalent to a = a ^ 2 => a = " + a + " ^ 2 = " + (a ^ 2));
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator (indicates positive value): " + a + " = +" + a);        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if (a.equals(b)){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if (a.equals(b)){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for a = " + a + " and b = " + b + " :");
            if ( (a == 10) && (b == 3) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 10 AND b is 3 \" evaluates to TRUE");
            }
            if ( (a == 10) || (b == 10) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 10 OR b is 10\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a.equals(b)) ? a : b) );
        
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
        if (a instanceof Byte){
            System.out.println("\t Byte object a = 10 is an instance of class Byte.");
        }     
        if (b instanceof Byte){
            System.out.println("\t Byte object b = 3 is an instance of class Byte.");
        }    
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators applied to a Byte reference variable a = 10 (" + (Integer.toBinaryString(a)) + " in binary) : " );   
        System.out.println("\t *Unary bitwise complement: ~a = " + (~a) + " (" + (Integer.toBinaryString(~a)) + " in binary) : " );
        System.out.println("\t *Bit shift operators: ");    
        System.out.println("\t \t *Signed left shift 2 places: a << 2 = " + (a << 2) + " (" + (Integer.toBinaryString(a << 2)) + " in binary) : " );
        System.out.println("\t \t *Signed right shift 2 places: a >> 2 = " + (a >> 2) + " (" + (Integer.toBinaryString(a >> 2)) + " in binary) : " );
        System.out.println("\t \t *Unsigned right shift 2 places: a >>> 2 = " + (a >>> 2) + " (" + (Integer.toBinaryString(a >>> 2)) + " in binary) : " );
        System.out.println("\t *Bitwise AND: a & b equivalent to " + a + " & " + b + " = " + (a & b) + " (" + (Integer.toBinaryString(a & b)) + " in binary) : " );
        System.out.println("\t *Bitwise exclusive OR: a ^ b equivalent to " + a + " ^ " + b + " = " + (a ^ b) + " (" + (Integer.toBinaryString(a ^ b)) + " in binary) : " );
        System.out.println("\t *Bitwise inclusive OR: a | b equivalent to " + a + " | " + b + " = " + (a | b) + " (" + (Integer.toBinaryString(a | b)) + " in binary) : \n" );
}
    static void shortWrapper(){        
        Short a, b;
        a = 50;
        b = 7;
        System.out.println("Considering 2 Short instance variables a = 50 and b = 7, we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: \n");
       
            //Assignment operators
            System.out.println("Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + b);
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: a <<= 2 equivalent to a = a << 2 => a = " + a + " << 2 " + " = " + (a << 2) );
            System.out.println("\t *Right shift AND assignment operator: a &= 2 equivalent to a = a & 2 => a = " + a + " & 2 " + " = " + (a & 2) );
            System.out.println("\t *Bitwise AND assignment operator: a >>= 2 equivalent to a = a >> 2 => a = " + a + " >> 2 = " + (a >> 2) );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: a |= 2 equivalent to a = a | 2 => a = " + a + " | 2 = " + (a | 2) );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: a ^= 2 equivalent to a = a ^ 2 => a = " + a + " ^ 2 = " + (a ^ 2));
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator (indicates positive value): " + a + " = +" + a);        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if (a.equals(b)){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if (!(a.equals(b))){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for a = " + a + " and b = " + b + " :");
            if ( (a == 50) && (b == 7) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 50 AND b is 7 \" evaluates to TRUE");
            }
            if ( (a == 50) || (b == 50) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 50 OR b is 50\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a.equals(b)) ? a : b) );
        
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
        if (a instanceof Short){
            System.out.println("\t Short object a = 10 is an instance of class Short.");
        }     
        if (b instanceof Short){
            System.out.println("\t Short object b = 3 is an instance of class Short.");
        }     
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators applied to a Short instance variable a = 50 (" + (Integer.toBinaryString(a)) + " in binary) : " );   
        System.out.println("\t *Unary bitwise complement: ~a = " + (~a) + " (" + (Integer.toBinaryString(~a)) + " in binary) : " );
        System.out.println("\t *Bit shift operators: ");    
        System.out.println("\t \t *Signed left shift 2 places: a << 2 = " + (a << 2) + " (" + (Integer.toBinaryString(a << 2)) + " in binary) : " );
        System.out.println("\t \t *Signed right shift 2 places: a >> 2 = " + (a >> 2) + " (" + (Integer.toBinaryString(a >> 2)) + " in binary) : " );
        System.out.println("\t \t *Unsigned right shift 2 places: a >>> 2 = " + (a >>> 2) + " (" + (Integer.toBinaryString(a >>> 2)) + " in binary) : " );
        System.out.println("\t *Bitwise AND: a & b equivalent to " + a + " & " + b + " = " + (a & b) + " (" + (Integer.toBinaryString(a & b)) + " in binary) : " );
        System.out.println("\t *Bitwise exclusive OR: a ^ b equivalent to " + a + " ^ " + b + " = " + (a ^ b) + " (" + (Integer.toBinaryString(a ^ b)) + " in binary) : " );
        System.out.println("\t *Bitwise inclusive OR: a | b equivalent to " + a + " | " + b + " = " + (a | b) + " (" + (Integer.toBinaryString(a | b)) + " in binary) : \n" );
    }
    
    static void intWrapper(){        
        Integer a, b;
        a = 100;
        b = 19;
        System.out.println("Considering 2 Integer reference variables a = 100 and b = 19, we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: ");
       
            //Assignment operators
            System.out.println("\t Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + b);
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: a <<= 2 equivalent to a = a << 2 => a = " + a + " << 2 " + " = " + (a << 2) );
            System.out.println("\t *Right shift AND assignment operator: a &= 2 equivalent to a = a & 2 => a = " + a + " & 2 " + " = " + (a & 2) );
            System.out.println("\t *Bitwise AND assignment operator: a >>= 2 equivalent to a = a >> 2 => a = " + a + " >> 2 = " + (a >> 2) );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: a |= 2 equivalent to a = a | 2 => a = " + a + " | 2 = " + (a | 2) );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: a ^= 2 equivalent to a = a ^ 2 => a = " + a + " ^ 2 = " + (a ^ 2));
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator (indicates positive value): " + a + " = +" + a);        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if (a.equals(b)){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if ( !(a.equals(b)) ){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for a = " + a + " and b = " + b + " :");
            if ( (a == 100) && (b == 19) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 100 AND b is 19 \" evaluates to TRUE");
            }
            if ( (a == 100) || (b == 100) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 100 OR b is 100\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a.equals(b)) ? a : b) );
        
         //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
        if (a instanceof Integer){
            System.out.println("\t Integer object a = " + a + " is an instance of Integer class.");
        }
        if (b instanceof Integer){
            System.out.println("\t Integer object b = " + b + " is an instance of Integer class.");
        }
                       
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators applied to an Integer instance variable a = 100 (" + (Integer.toBinaryString(a)) + " in binary) : " );   
        System.out.println("\t *Unary bitwise complement: ~a = " + (~a) + " (" + (Integer.toBinaryString(~a)) + " in binary) : " );
        System.out.println("\t *Bit shift operators: ");    
        System.out.println("\t \t *Signed left shift 2 places: a << 2 = " + (a << 2) + " (" + (Integer.toBinaryString(a << 2)) + " in binary) : " );
        System.out.println("\t \t *Signed right shift 2 places: a >> 2 = " + (a >> 2) + " (" + (Integer.toBinaryString(a >> 2)) + " in binary) : " );
        System.out.println("\t \t *Unsigned right shift 2 places: a >>> 2 = " + (a >>> 2) + " (" + (Integer.toBinaryString(a >>> 2)) + " in binary) : " );
        System.out.println("\t *Bitwise AND: a & b equivalent to " + a + " & " + b + " = " + (a & b) + " (" + (Integer.toBinaryString(a & b)) + " in binary) : " );
        System.out.println("\t *Bitwise exclusive OR: a ^ b equivalent to " + a + " ^ " + b + " = " + (a ^ b) + " (" + (Integer.toBinaryString(a ^ b)) + " in binary) : " );
        System.out.println("\t *Bitwise inclusive OR: a | b equivalent to " + a + " | " + b + " = " + (a | b) + " (" + (Integer.toBinaryString(a | b)) + " in binary) : " );
    }
        
    static void longWrapper(){        
        Long a, b;
        a = 2500L;
        b = 30L;
        System.out.println("Considering 2 Long instance variables a = 2500 and b = 30, we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: ");
       
            //Assignment operators
            System.out.println("\t Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + b);
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: a <<= 2 equivalent to a = a << 2 => a = " + a + " << 2 " + " = " + (a << 2) );
            System.out.println("\t *Right shift AND assignment operator: a &= 2 equivalent to a = a & 2 => a = " + a + " & 2 " + " = " + (a & 2) );
            System.out.println("\t *Bitwise AND assignment operator: a >>= 2 equivalent to a = a >> 2 => a = " + a + " >> 2 = " + (a >> 2) );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: a |= 2 equivalent to a = a | 2 => a = " + a + " | 2 = " + (a | 2) );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: a ^= 2 equivalent to a = a ^ 2 => a = " + a + " ^ 2 = " + (a ^ 2));
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator (indicates positive value): " + a + " = +" + a);        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if (a.equals(b)){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if ( !(a.equals(b)) ){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for a = " + a + " and b = " + b + " :");
            if ( (a == 2500L) && (b == 30L) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 2500 AND b is 30 \" evaluates to TRUE");
            }
            if ( (a == 2500L) || (b == 2500L) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 2500 OR b is 2500\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for 2 variables a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a.equals(b)) ? a : b) );
        
         //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
        if (a instanceof Long){
            System.out.println("\t Long object a = " + a + " is an instance of Long class. ");
        }
        if (b instanceof Long){
            System.out.println("\t Long object b = " + b + " is an instance of Long class. ");
        }
                
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators applied to a Long instance variable a = 2500 (" + (Long.toBinaryString(a)) + " in binary) : " );   
        System.out.println("\t *Unary bitwise complement: ~a = " + (~a) + " (" + (Long.toBinaryString(~a)) + " in binary) : " );
        System.out.println("\t *Bit shift operators: ");    
        System.out.println("\t \t *Signed left shift 2 places: a << 2 = " + (a << 2) + " (" + (Long.toBinaryString(a << 2)) + " in binary) : " );
        System.out.println("\t \t *Signed right shift 2 places: a >> 2 = " + (a >> 2) + " (" + (Long.toBinaryString(a >> 2)) + " in binary) : " );
        System.out.println("\t \t *Unsigned right shift 2 places: a >>> 2 = " + (a >>> 2) + " (" + (Long.toBinaryString(a >>> 2)) + " in binary) : " );
        System.out.println("\t *Bitwise AND: a & b equivalent to " + a + " & " + b + " = " + (a & b) + " (" + (Long.toBinaryString(a & b)) + " in binary) : " );
        System.out.println("\t *Bitwise exclusive OR: a ^ b equivalent to " + a + " ^ " + b + " = " + (a ^ b) + " (" + (Long.toBinaryString(a ^ b)) + " in binary) : " );
        System.out.println("\t *Bitwise inclusive OR: a | b equivalent to " + a + " | " + b + " = " + (a | b) + " (" + (Long.toBinaryString(a | b)) + " in binary) : " );
    }   
    
    static void charWrapper(){  
        Character a, b;
        a = 'A';
        b = 'B';
        System.out.println("Considering 2 Character instance variables a = 'A' (int value = " + Character.getNumericValue(a) + " ) and b = 'B' "
                            + "(int value = " + Character.getNumericValue(b) + " ), we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: ");
       
            //Assignment operators
            System.out.println("\t Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + "'" + b + " '");
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: a <<= 2 equivalent to a = a << 2 => a = " + a + " << 2 " + " = " + (a << 2) );
            System.out.println("\t *Right shift AND assignment operator: a &= 2 equivalent to a = a & 2 => a = " + a + " & 2 " + " = " + (a & 2) );
            System.out.println("\t *Bitwise AND assignment operator: a >>= 2 equivalent to a = a >> 2 => a = " + a + " >> 2 = " + (a >> 2) );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: a |= 2 equivalent to a = a | 2 => a = " + a + " | 2 = " + (a | 2) );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: a ^= 2 equivalent to a = a ^ 2 => a = " + a + " ^ 2 = " + (a ^ 2));
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator: indicates positive value of a ");        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if (a.equals(b)){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if ( !(a.equals(b)) ){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for a = " + a + " and b = " + b + " :");
            if ( (a == 'A') && (b == 'B') ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 'A' AND b is 'B' \" evaluates to TRUE");
            }
            if ( (a == 'A') || (b == 'A') ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 'A' OR b is 'A'\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a.equals(b)) ? a : b) );
        
         //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
        if (a instanceof Character){
            System.out.println("\t Character object a = " + a + " is an instance of Character class. ");
        }
        if (b instanceof Character){
            System.out.println("\t Character object b = " + b + " is an instance of Character class. ");
        }
            
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators applied to Character instance variable a = 'A' (" + (Integer.toBinaryString(a)) + " in binary) : " );   
        System.out.println("\t *Unary bitwise complement: ~a = " + (~a) + " (" + (Integer.toBinaryString(~a)) + " in binary) : " );
        System.out.println("\t *Bit shift operators: ");    
        System.out.println("\t \t *Signed left shift 2 places: a << 2 = " + (a << 2) + " (" + (Integer.toBinaryString(a << 2)) + " in binary) : " );
        System.out.println("\t \t *Signed right shift 2 places: a >> 2 = " + (a >> 2) + " (" + (Integer.toBinaryString(a >> 2)) + " in binary) : " );
        System.out.println("\t \t *Unsigned right shift 2 places: a >>> 2 = " + (a >>> 2) + " (" + (Integer.toBinaryString(a >>> 2)) + " in binary) : " );
        System.out.println("\t *Bitwise AND: a & b equivalent to " + a + " & " + b + " = " + (a & b) + " (" + (Integer.toBinaryString(a & b)) + " in binary) : " );
        System.out.println("\t *Bitwise exclusive OR: a ^ b equivalent to " + a + " ^ " + b + " = " + (a ^ b) + " (" + (Integer.toBinaryString(a ^ b)) + " in binary) : " );
        System.out.println("\t *Bitwise inclusive OR: a | b equivalent to " + a + " | " + b + " = " + (a | b) + " (" + (Integer.toBinaryString(a | b)) + " in binary) : \n" );
    }
           
    static void floatWrapper(){        
        Float a, b;
        a = 1000.5f;
        b = 20.5f;
        System.out.println("Considering 2 Float instance variables a = 1000.5 and b = 20.5, we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: ");
       
            //Assignment operators
            System.out.println("\t Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + b);
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: available only for integral types! " );
            System.out.println("\t *Right shift AND assignment operator: available only for integral types! " );
            System.out.println("\t *Bitwise AND assignment operator: available only for integral types! " );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: available only for integral types! " );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: available only for integral types! ");
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator (indicates positive value): " + a + " = +" + a);        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if (a.equals(b)){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if ( !(a.equals(b)) ){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for a = " + a + " and b = " + b + " :");
            if ( (a == 1000.5f) && (b == 20.5f) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 1000.5 AND b is 20.5 \" evaluates to TRUE");
            }
            if ( (a == 1000.5f) || (b == 1000.5f) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 1000.5 OR b is 1000.5\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for 2 variables a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a.equals(b)) ? a : b) );
        
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
        if (a instanceof Float){
            System.out.println("\t Float object a = " + a + " is an instance of Float class. ");
        }
        if (b instanceof Float){
            System.out.println("\t Float object b = " + b + " is an instance of Float class. ");
        }
            
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators:  available only for integral types! " );   
    }
       
    static void doubleWrapper(){        
        Double a, b;
        a = 1000.55D;
        b = 20.55D;
        System.out.println("Considering 2 Double instance variables a = 1000.55 and b = 20.55, we will have: ");
        //Assignment, arithmetic and unary operators
        System.out.println("Assignment, arithmetic and unary operator: ");
       
            //Assignment operators
            System.out.println("\t Assignment operators:");
            System.out.println("\t *The simple assignment operator: a = b" + " equivalent to " + "a = " + b);
            System.out.println("\t *Add AND assignment operator: a += b equivalent to a = a + b =>  a = " + a + " + " + b + " = " + (a + b) );
            System.out.println("\t *Substract AND assignment operator: a -= b equivalent to a = a - b =>  a = " + a + " - " + b + " = " + (a - b) );
            System.out.println("\t *Multiply AND assignment operator: a *= b equivalent to a = a * b => a = " + a + " * " + b + " = " + (a * b) );
            System.out.println("\t *Divide AND assignment operator: a /= b equivalent to a = a / b => a = " + a + " / " + b + " = " + (a / b) );
            System.out.println("\t *Remainder AND assignment operator: a %= b equivalent to a = a % b => a = " + a + " % " + b + " = " + (a % b) );
            System.out.println("\t *Left shift AND assignment operator: available only for integral types! " );
            System.out.println("\t *Right shift AND assignment operator: available only for integral types! " );
            System.out.println("\t *Bitwise AND assignment operator: available only for integral types! " );
            System.out.println("\t *Bitwise inclusive OR and assignment operator: available only for integral types! " );
            System.out.println("\t *Bitwise exclusive OR and assignment operator: available only for integral types! ");
        
            //Arithmetic operators
            System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator: " + a + " + " + b + " = " + (a + b));        
            //Substraction operator
            System.out.println("\t *Substraction operator: " + a + " - " + b + " = " + (a - b));        
            //Multiplication operator
            System.out.println("\t *Multiplication operator: " + a + " * " + b + " = " + (a * b));        
            //Division operator
            System.out.println("\t *Division operator: " + a + " / " + b + " = " + (a / b));        
            //Remainder operator
            System.out.println("\t *Remainder operator: " + a + " / " + b + " = " + (a % b));
        
            //Unary operators
            System.out.println("\n Unary operators: " );        
            //Unary plus operator
            System.out.println("\t *Unary plus operator (indicates positive value): " + a + " = +" + a);        
            //Unary minus operator
            System.out.println("\t *Unary minus operator (negates an expression): " + a + " changes its value to " + (-a) );        
            //Increment operator
            System.out.println("\t *Increment operator: " + "\n \t \t * prefix (increments the value, then evaluates the new value): " + "(++a) = " + (++a) );
            --a;
            System.out.println("\t \t * postfix (evaluates the original value, then increments it): " + "(a++) = " + (a++) );
            --a;
            //Decrement operator
            System.out.println("\t *Decrement operator: " + "\n \t \t * prefix (decrements the value, then evaluates the new value): " + "(--a) = " + (--a) );
            ++a;
            System.out.println("\t \t * postfix (evaluates the original value, then decrements it): " + "(a--) = " + (a--) );
            ++a;
            
        //Equality, relational and conditional operators
        System.out.println("\n Equality, relational and conditional operators: " );    
        
            //The equality and relational operators
            System.out.println("\t *Equality and relational operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if ( a.equals(b) ){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if ( !(a.equals(b)) ){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
            if (a > b){
                System.out.println("\t \t a > b");
            }else{
                System.out.println("\t \t a > b is false!");
            }
            if (a >= b){
                System.out.println("\t \t a >= b");
            }else{
                System.out.println("\t \t a >= b is false!");
            }
            if (a < b){
                System.out.println("\t \t a < b");
            }else{
                System.out.println("\t \t a < b is false!");
            }
            if (a <= b){
                System.out.println("\t \t a <= b");
            }else{
                System.out.println("\t \t a <= b is false!");
            }    
            
            //The conditional operators
            System.out.println("\t *The conditional operators - for a = " + a + " and b = " + b + " :");
            if ( (a == 1000.55D) && (b == 20.55D) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is 1000.55 AND b is 20.55 \" evaluates to TRUE");
            }
            if ( (a == 1000.55D) || (b == 1000.55D) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is 1000.55 OR b is 1000.55\" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator -> ((a==b) ? a : b) for 2 variables a = " + a + " and b = " + b + " will evaluate the condition (a == b) "
                                + "and will return the value of a if condition is 'true' or the value of b if condition is 'false'");
            System.out.println("\t \t \t result = " + ((a.equals(b)) ? a : b) );
        
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
        if (a instanceof Double){
            System.out.println("\t Double object a = " + a + " is an instance of Double class. ");
        }
        if (b instanceof Double){
            System.out.println("\t Double object b = " + b + " is an instance of Double class. ");
        }
            
        //Bitwise and bit shift operators
        System.out.println("\n Bitwise and bit shift operators:  available only for integral types! " );   
    }
    
    static void booleanWrapper(){        
        Boolean isTrue, isFalse;
        isTrue = true;
        isFalse = false;
        System.out.println("Considering 2 Boolean instance variables isTrue = 'true' and isFalse = 'false', we will have: ");
        
        //Assignment operators
        System.out.println("\n Assignment operators: ");
        System.out.println("\t *The simple assignment operator: isTrue = isFalse" + " equivalent to " + "isTrue = " + isFalse);
                
        //Equality and conditional operators
        System.out.println("\n Equality and conditional operators: " );    
        
            //The equality operators
            System.out.println("\t *Equality operators - compare isTrue = " + isTrue + " and isFalse = " + isFalse + " :"); 
            if ( isTrue.equals(isFalse) ){
                System.out.println("\t \t isTrue == isFalse");
            }else{
                System.out.println("\t \t 'isTrue == isFalse' has the logical value of 'false' ");
            }
            if ( !(isTrue.equals(isFalse)) ){
                System.out.println("\t \t isTrue != isFalse");
            }else{
                System.out.println("\t \t 'isTrue != isFalse' has the logical value of 'false' ");
            }
           
            //The conditional operators
            System.out.println("\t *The conditional operators - for isTrue = " + isTrue + " and isFalse = " + isFalse + " :");
            if ( (isTrue == true) && (isFalse == false) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"isTrue is 'true' AND isFalse is 'false' \" evaluates to TRUE");
            }
            if ( (isTrue == true) || (isFalse == true) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"isTrue is 'true' OR isFalse is 'true' \" evaluates to TRUE");
            }
            System.out.println("\t \t *Ternary operator - for 2 Boolean instance variables isTrue = " + isTrue + " and isFalse = " + isFalse + " will evaluate the condition"
                                + " (isTrue == isFalse) and will return the value of isTrue if condition is 'true' or the value of isFalse if condition is 'false'");
            System.out.println("\t \t \t result = " + ((isTrue.equals(isFalse)) ? isTrue : isFalse) );
        
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
        if (isTrue instanceof Boolean){
            System.out.println("\t Boolean object isTrue = " + isTrue + " is an instance of Boolean class. ");
        }
        if (isFalse instanceof Boolean){
            System.out.println("\t Boolean object isFalse = " + isFalse + " is an instance of Boolean class.");
        }
            
        //Logical operators
        System.out.println("\n Logical operators applied to Boolean instance variables isTrue = true and isFalse = false : " );
        System.out.println("\t *Logical complement: !isTrue = " + (!(isTrue)) );
        System.out.println("\t *Logical AND: isTrue & isFalse equivalent to " + isTrue + " & " + isFalse + " = " + (isTrue & isFalse) );
        System.out.println("\t *Logical exclusive OR: isTrue ^ isFalse equivalent to " + isTrue + " ^ " + isFalse + " = " + (isTrue ^ isFalse)  );
        System.out.println("\t *Logical inclusive OR: isTrue | isFalse equivalent to " + isTrue + " | " + isFalse + " = " + (isTrue | isFalse)  );
    }
        
    static void stringVar(){        
        String a, b;
        a = "In Java programming language, ";
        b = "strings are treated as objects.";
        System.out.println("\n Considering 2 String variable a = 'In Java programming language, ' and b = 'strings are treated as objects.', we will have: ");
        
        //Assignment and arithmetic operators
        System.out.println("\n Assignment and arithmetic operators: ");
        //Assignment operators
        System.out.println("\t Assignment operators:");
        System.out.println("\t *The simple assignment operator: expression = a" + " equivalent to " + "expression = " + a);
                        
        //Arithmetic operators
        System.out.println("\n Arithmetic operators: " );              
            //Addition operator
            System.out.println("\t *Addition operator (concatenation): " + a + " + " + b + " = " + (a + b));        
                    
        //Equality and conditional operators
        System.out.println("\n Equality and conditional operators: " );    
        
            //The equality operators
            System.out.println("\t *Equality operators - compare 2 values a = " + a + " and b = " + b + " :"); 
            if ( a.equals(b) ){
                System.out.println("\t \t a == b");
            }else{
                System.out.println("\t \t a == b is false!");
            }
            if ( !(a.equals(b)) ){
                System.out.println("\t \t a != b");
            }else{
                System.out.println("\t \t a != b is false!");
            }
                        
            //The conditional operators
            System.out.println("\t *The conditional operators - for 2 variables a = " + a + " and b = " + b + " :");
            if ( (a.equals("In Java programming language, ")) && (b.equals("strings are treated as objects.")) ) {
                System.out.println("\t \t *Conditional-AND operator:  Expression \"a is \"In Java programming language, \" AND b is \"strings are treated as objects.\" \" evaluates to TRUE");
            }
            if ( (a.equals("In Java programming language, ")) || (b.equals("In Java programming language, ")) ) {
                System.out.println("\t \t *Conditional-OR operator:  Expression \"a is \"In Java programming language, \" OR b is \"strings are treated as objects.\"\" evaluates to TRUE");
            }
                    
        //Type comparison operator
        System.out.println("Type comparison operator: instanceof - used only for object reference variables! ");
        if (a instanceof String){
            System.out.println("\t String variable a = \"In Java programming language, \" is an instance of class String.");
        }     
        if (b instanceof String){
            System.out.println("\t String variable b = \"strings are treated as objects.\" is an instance of class String.");
        }
    }
}
    
