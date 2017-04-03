/*
 * Shape triangle
 */
package Shapes;

/**
 *
 * @author kossT
 */
public class Triangle extends Shape{
    
    private static final String DEFINITION = "este definita de 3 pct necoliniare plane.";

    @Override
    public String getDEFINITION() {
        return (super.getDEFINITION()+ DEFINITION);
    }
    
}
