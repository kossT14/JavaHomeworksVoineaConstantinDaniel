/*
 * Class implementation to compute circle area
 * of given radius
 */
package exceptions;

/**
* @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-12-30
*/
public class CircleArea {
    
    public static void main(String[] args) {
        try {
            System.out.println(circleArea(-10.5));
            // catch exception if inputted radius has neggative value
        } catch (Exception e) {
            System.out.println("Cannot calculate area: " + e.getMessage());
        }
    }

    static double circleArea(double radius) throws Exception {
        if(radius < 0){
            throw new Exception("radius should be positive");
        }
        return Math.PI * radius * radius;
    }
}
