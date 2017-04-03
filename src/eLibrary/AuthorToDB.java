/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author kossT
 */
public class AuthorToDB {
    
    private static final String URL = "jdbc:derby://localhost:1527/EBOOKSDB;create=true;";
    private static final String USER = "kossT";
    private static final String PASSWORD = "1411";
    
    static void insertAuthor(String isbn, Author aut) {
        Connection con;
        Statement stm;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stm = con.createStatement();
            stm.execute("INSERT INTO kossT.AUTHORS "
                    + "(ISBN, ID, NAME, SURNAME)"
                    + " VALUES ('" + isbn + "', " + aut.getId() 
                    + ", '" + aut.getName()+ "', '" + aut.getSurname()
                    + "')");
            System.out.println("\nCurrent author added to DB!");
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        DBConnection.shutdown();
    }
    
    static void updateAuthor(String isbn, Author aut) {
        Connection con;
        Statement stm;  
        
        String field = new ValidInput().validInput("name_or_surname");
        
        String toUpdate = null;
        String updateValue = null;
        switch(field) {
            case "name": 
                toUpdate = "NAME";
                updateValue = new ValidInput().validInput("name");
                break;
            case "surname":
                toUpdate = "SurNAME";
                updateValue = new ValidInput().validInput("surname");
                break;
        }        
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stm = con.createStatement();
            stm.execute("UPDATE kossT.AUTHORS SET \"" + toUpdate + "\" = '" + updateValue + "' WHERE ISBN = '" + isbn + "' AND ID = " + aut.getId());
            System.out.println("\nField updated!");
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        DBConnection.shutdown();
    }
        
    static void deleteAuthor(String isbn, Author aut) {
        Connection con;
        Statement stm;
        
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stm = con.createStatement();
            stm.execute("DELETE FROM kossT.AUTHORS WHERE ISBN = '" + isbn + "' AND ID = " + aut.getId());
            System.out.println("\nSpecified author deleted from DB!");
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        DBConnection.shutdown();
    }
    
    static void selectAuthor() {
        Connection con;
        Statement stm;
        ResultSet rs = null;
        
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM kossT.AUTHORS");
            boolean tableNotEmpty = rs.next();
            if (tableNotEmpty)
                do {
                    System.out.println(rs.getString(1) + "\t\t"
                            + rs.getInt(2) + "\t\t"
                            + rs.getString(3) + "\t\t"
                            + rs.getString(4) + "\n"
                            + "======================"
                            + "======================");
                } while(rs.next());
            else
                System.out.println("Empty table!");
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                }
                catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
        DBConnection.shutdown();
    }
    
}

