/*
 * Shape line
 */
package Shapes;

/**
 *
 * @author kossT
 */
public class Line extends Shape{
    
    private static final String DEFINITION = "trece prin 2 pct oarecare din plan.";

    @Override
    public String getDEFINITION() {
        return (super.getDEFINITION() + DEFINITION);
    }
    
    
}
