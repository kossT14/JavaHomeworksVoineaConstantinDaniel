/*
 * Class Division
 */
package calculator;

/**
 * Class does the division of two specified numbers. Their type is double.
 * @author kossT
 */
public class Division {
    double r;

    /**
     *
     * @param a
     * @param b
     * @return result of division of 2 doubles
     */
    public double divideNumbers(double a, double b){ 
        try {
            r = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Err: " + e.getMessage());
        }
        return r;
    }
}
