/*
 * Implementation of class SpanishGreeting
 */
package HelloWorldAnonymousClasses;

/**
 * Class SpanishGreeting implements HelloWorld interface 
 * @author kossT
 */
public class SpanishGreeting implements HelloWorldAnonymousClasses.HelloWorld{
    
    String name = "mundo";
    
    @Override
    public void greet() {
        greetSomeone("mundo");
    }

    @Override
    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Hola, " + name);
    } 
}
