/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eLibrary;

import java.util.Scanner;

/**
 *
 * @author kossT
 */
public class EbookCategoryMenu extends Menu{
    private static final String CATEGORY_MENU = "Category menu";
    private final Scanner sc = new Scanner(System.in);

    public EbookCategoryMenu() {
        super(CATEGORY_MENU);
    }
    
    @Override
    public void displayMenu(){
        System.out.println("C h o o s e     c a t e g o r y *** :"
                + "\n\t (1) Technical"
                + "\n\t (2) Novel" 
                + "\n\t (3) Art album"
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
            valid = input.matches("^[1-3]$");
            try {
                option = Byte.parseByte(input);
            }
            catch(NumberFormatException e) {
                onCatch = true;
                System.out.println("Invalid category, "
                        + "please choose valid option!");
            }
            if ((!valid) && (!onCatch)){
                System.out.println("Invalid category, "
                        + "please choose valid option!");
            }
        } while ( (!valid) && (new Functionality().checkRetry(new Functionality().getInputFromScanner())) );    
        return option;   
    }    

    
    public static String getCATEGORY_MENU() {
        return CATEGORY_MENU;
    }

    
    
}
