/*
 * Rectangle square
 */
package Shapes;

/**
 *
 * @author kossT
 */
public class Square extends Rectangle{
    
    private static final String DEFINITION = " si toate laturile egale.";

    /**
     *
     * @return definition of square
     */
    @Override
    public String getDEFINITION() {
        return (super.getDEFINITION()+ DEFINITION);
    }
    
}
