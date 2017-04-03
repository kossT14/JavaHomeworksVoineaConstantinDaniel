/*
 * Implementation of class FrenchGreeting
 */
package HelloWorldAnonymousClasses;

/**
 * Class FrenchGreeting implements HelloWorld interface
 * @author kossT
 */
public class FrenchGreeting implements HelloWorldAnonymousClasses.HelloWorld{

    String name = "tout le monde";
    
    @Override
    public void greet() {
        greetSomeone("tout le monde");
    }

    @Override
    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Salut, " + name);
    } 
    
}
