/*
 * CNP class
 */
package cnp;

/**
 * Main class 
 * @author kossT
 */
public class Cnp {
    public static void main(String[] args){
        do{
            new ValidCnp().runValidater(new UserInteraction().getCnpFromScanner());
        }
        while (new UserInteraction().checkRetry());
    }
}
