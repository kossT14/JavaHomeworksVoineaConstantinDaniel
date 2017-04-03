/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebookstore;

import java.util.Scanner;

/**
 *
 * @author kossT
 */
public class MainMenu extends Menu{
    private static final String MAIN_MENU = "Main menu";
    private final Scanner sc = new Scanner(System.in);

    public MainMenu() {
        super(MAIN_MENU);
    }
        
    @Override
    public void displayMenu (){
        System.out.println("C h o o s e     o p t i o n ***:"
                + "\n\t  (1) Add eBook to store"
                + "\n\t  (2) Sell eBook" 
                + "\n\t  (3) Remove eBook from store"
                + "\n\t  (4) List available eBooks"
                + "\n\t  (5) List sold eBooks"
                + "\n\t  (6) List available authors"
                + "\n\t  (7) Update eBook price"
                + "\n\t  (8) Add rating"
                + "\n\t  (9) List rating details for specified eBook"
                + "\n\t (10) Manual Test"
                + "\n\t  (0) Exit"
                + "\n *** by indicating preceding number ");
    }   

    @Override
    public byte inputMenuOption(){
        byte option = 0;
        boolean valid;
        String input;
        boolean onCatch = false;
        do {
            displayMenu();
            input = sc.nextLine();
            valid = input.matches("^[0-9]|10$");
            try {
                option = Byte.parseByte(input);
            }
            catch(NumberFormatException e) {
                onCatch = true;
                System.out.println("Invalid input, "
                        + "please choose valid option!");
            }
            if ((!valid) && (!onCatch)){
                System.out.println("Invalid input, "
                        + "please choose valid option!");
            }
        } while ( (!valid) && (new Functionality().checkRetry(new Functionality().getInputFromScanner())) );    
        return option;   
    }    

    
    public static String getMAIN_MENU() {
        return MAIN_MENU;
    }
    
    
    
}
