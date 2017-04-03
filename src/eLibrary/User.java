/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eLibrary;

/**
 *
 * @author kossT
 */
public class User {
    private final String username;
    private final int id;

    public User() {
        this.username = new ValidInput().validInput("username");
        this.id = Functionality.createID();
    }
    
    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }
    
    
    
}
