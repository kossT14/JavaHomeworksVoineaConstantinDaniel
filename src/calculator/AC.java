/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;


/**
 *
 * @author kossT
 */
public class AC {

    /**
     *
     * @param s
     */
    public static void treatAC(String s){
        if (s.equalsIgnoreCase("AC")){
            System.out.println("0");
            Calculator.runCalculator();
        } 
    }        
}
