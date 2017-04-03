/*
 * Implementation of class Car
 */
package cars;


/**
 * Class implements attributes and behavior of a car 
 * @author kossT
 */
public class Car {
    // create attributes of car
    private Name name;
    private Color color;
    
    // Create car name enumeration
    public enum Name{
        DACIA, MERCEDES, RENAULT};

    // Create color enumeration
    public enum Color{
        WHITE, RED, GREEN, BLUE, MAGENTA, YELLOW};
        
    // Default constructor
    public Car(){
        super();
    }
    
    // Convenience constructor 
    public Car(Name name, Color color){
        this.name = name;
        this.color = color;
    }
   
    // Convenience constructor with attributes passed in by String var
    public Car(String name, String color){
        for (Name n : Name.values()){
            if (name.equalsIgnoreCase(n.name())){
                this.name = n;
            }
        }
        for (Color c : Color.values()){
            if (color.equalsIgnoreCase(c.name())){
                this.color = c;
            }
        }
    }
    
    // Name getter and setter
    public Name getName() {
        return name;
    }
    public void setName(Name name) {
        this.name = name;
    }
        
    // Color getter and setter
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
}
