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
public abstract class Menu {
    private final String menuType;
    
    public Menu(String menuType) {
        this.menuType = menuType;
    }
    
    public abstract void displayMenu(); 
        
    public abstract byte inputMenuOption();

    public String getMenuType() {
        return menuType;
    }
    
    
        
  
}
