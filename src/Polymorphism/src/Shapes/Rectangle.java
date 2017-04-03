/*
 * Shape rectangle
 */
package Shapes;

/**
 *
 * @author kossT
 */
public class Rectangle extends Shape{
    
    private static final String DEFINITION = "este patrulater cu toate unghiurile "
            + "drepte si laturile paralele 2 cate 2";

    @Override
    public String getDEFINITION() {
        return (super.getDEFINITION()+ DEFINITION);
    }
    
}
