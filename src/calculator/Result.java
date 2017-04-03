/*
 * Class Result
 */
package calculator;

import java.util.Scanner;

/**
 * Display a message in console
 * @author kossT
 */
public class Result {
     /**
      Request input of operand, handle special cases
      * when user introduces anything else than expected 
      * and return double value. 
     * @param result
     */
    public void printResult(double result){
        Scanner op = new Scanner(System.in);
        String s = op.nextLine();
        if (s.equals("=")){
            System.out.println(result);
        }else{
            AC.treatAC(s);
            Calculator.closeCalculator(s);
            System.out.println("Press '=' operator to display result!");
            printResult(result);
        }
    }
    
}
