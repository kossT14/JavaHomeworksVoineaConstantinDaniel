/*  
 *      Strings and numbers at work 
 *
 * 	1. What is the initial capacity of the following string builder?
 * StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");

 *      2. Consider the following string:
 * String hannah = "Did Hannah see bees? Hannah did.";

 * a)	What is the value displayed by the expression hannah.length()?
 * b)	What is the value returned by the method call hannah.charAt(12)?
 * c)	Write an expression that refers to the letter b in the string referred to by hannah.

 *     3. How long is the string returned by the following expression? What is the string?
 * "Was it a car or a cat I saw?".substring(9, 12)

 *     4. Show two ways to concatenate the following two strings together to get the string "Hi, mom.":
 * String hi = "Hi, ";
 * String mom = "mom.";
 * 
 */
package stringsandnumbersatwork;

/**
 *
 * @author kossT
 */

public class StringsAndNumbersAtWork {
    
    public static void main(String[] args) {
        // First exercice
        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        System.out.println("Ex. no. 1 : capacity of StringBuilder sb is " + sb.capacity());
        
        // Second exercice
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println("Ex. no. 2 : \n\ta)value displayed is " 
                        + hannah.length());
        System.out.println("\tb)value returned is \'" 
                        + hannah.charAt(12) + "\'");
        System.out.println("\tc) expression needed is: hannah.charAt(15) = " 
                        + hannah.charAt(15));
        
        // Third exercice
        System.out.println("Ex. no. 3 : \n\treturned String has a length of " 
                + "Was it a car or a cat I saw?".substring(9, 12).length()
                + " and a value of \"" 
                + "Was it a car or a cat I saw?".substring(9, 12) + "\"" );
        
        // Fourth exercice 
        String hi = "Hi, ";
        String mom = "mom.";
        System.out.println("Ex. no. 4 : \n\ttwo ways to concatenate Strings " 
                + "\"Hi, \"" + " and \"mom.\"" + " and get: \"" 
                + hi.concat(mom) + "\"");
        String hiMom = hi + mom;
        System.out.println("\t\ta) using \"+\" operator:  "
                + "String hiMom = hi + mom;");
        System.out.println("\t\tb) using concat method from String class:  "
                + "String hiMom = hi.concat(mom);");
        System.out.println("\t\t* hiMom String used for holding the result");
        
    }
}
