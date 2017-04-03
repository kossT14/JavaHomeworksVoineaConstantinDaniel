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
public class RatingToDB {
    
    private static final String URL = "jdbc:derby://localhost:1527/EBOOKSDB;create=true;";
    private static final String USER = "kossT";
    private static final String PASSWORD = "1411";
    
    
    static void insertRating(String isbn, Rating rtg) {
        Connection con;
        Statement stm;
        
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stm = con.createStatement();
            stm.execute("INSERT INTO kossT.RATINGS "
                    + "(ISBN, USER_ID, RATING, DESCRIPTION)"
                    + " VALUES ('" + isbn + "', " + rtg.getUserId()
                    + ", '" + rtg.getStars() + "', " + rtg.getDescription()
                    + ")");
            System.out.println("\nAdded rating to DB!");
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        DBConnection.shutdown();
    }
        
    static void updateRating(String isbn, Rating rtg) {
        Connection con;
        Statement stm;
        
        String field = new ValidInput().validInput("select_rating_field");
        
        String toUpdate = null;
        String updateValue = null;
        switch(field) {
            case "rating": 
                toUpdate = "RATING";
                updateValue = new ValidInput().validInput("rating");
                break;
            case "description":
                toUpdate = "DESCRIPTION";
                updateValue = new ValidInput().validInput("description");
                break;
        }
        
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stm = con.createStatement();
            if (field.equals("rating"))
                stm.execute("UPDATE kossT.RATINGS SET \"" + toUpdate + "\" = " + updateValue + " WHERE ISBN = '" + isbn + "' AND USER_ID = " + rtg.getUserId());
            else
                stm.execute("UPDATE kossT.RATINGS SET \"" + toUpdate + "\" = '" + updateValue + "' WHERE ISBN = '" + isbn + "' AND USER_ID = " + rtg.getUserId());
            System.out.println("\nSpecified field modified!");
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        DBConnection.shutdown();
    }
        
    static void deleteRating(String isbn, Rating rtg) {
        Connection con;
        Statement stm;
        
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stm = con.createStatement();
            stm.execute("DELETE FROM kossT.RATINGS WHERE ISBN = '" + isbn + "' AND USER_ID = " + rtg.getUserId());
            System.out.println("\nRating deleted from DB!");
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        DBConnection.shutdown();
    }
    
    static void selectRating() {
        Connection con;
        Statement stm;
        ResultSet resultSet = null;
        
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stm = con.createStatement();
            resultSet = stm.executeQuery("SELECT * FROM kossT.RATINGS");
            boolean tableNotEmpty = resultSet.next();
            if (tableNotEmpty)
                do {
                    System.out.println(resultSet.getString(1) + "\t\t"
                            + resultSet.getInt(2) + "\t\t"
                            + resultSet.getDouble(3) + "\t\t"
                            + resultSet.getString(4) + "======"
                            + "============================"
                            + "============================");
                } while(resultSet.next());
            else
                System.out.println("Empty table!");
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                }
                catch (SQLException ex) {
                    System.out.println(ex);
                }            
            }
        }
        DBConnection.shutdown();
    }
    
}
