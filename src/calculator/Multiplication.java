/*
 * Class Multiplication
 */
package calculator;

/**
 * Class does the multiplication of two specified numbers. Their type is double.
 * @author kossT
 */
public class Multiplication {
    double r;
    /**
     *
     * @param a
     * @param b
     * @return product of 2 numbers
     */
    public double multiplyNumbers(double a, double b){
       try {
            r = a * b;
        } catch (ArithmeticException e) {
            System.out.println("Err: " + e.getMessage());
        }
        return r;
    }
}
