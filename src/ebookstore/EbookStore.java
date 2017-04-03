/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebookstore;

/**
 *
 * @author kossT
 */
public class EbookStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu mainMenu = new MainMenu();
        Functionality func = new Functionality();
        do{
            MenuApp.runMenu(mainMenu, mainMenu.inputMenuOption());
            System.out.println("Do you want to continue "
                + "operations in eBookStore? (y/n)");
        }while (func.checkRetry(func.getInputFromScanner()));    
    }
    
}
