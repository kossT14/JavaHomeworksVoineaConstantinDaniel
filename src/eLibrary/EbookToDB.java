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
public class EbookToDB {
    
    private static final String URL = "jdbc:derby://localhost:1527/EBOOKSDB;create=true;";
    private static final String USER = "kossT";
    private static final String PASSWORD = "1411";
        
    static void insertEbook(Ebook eb) {
        Connection con;
        Statement stm;        
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stm = con.createStatement();
            stm.execute("INSERT INTO kossT.EBOOKS "
                    + "(ISBN, TITLE, SUBCATEGORY, NUMBER_OF_PAGES, RATING, PRICE)"
                    + " VALUES ('" + eb.getISBN() + "', '" + eb.getTitle() 
                    + "', '" + eb.getSubcategory() + "', "+ eb.getNoOfPages() 
                    + ", " + eb.getRating() + ", " + eb.getPrice() + ")");
            System.out.println("\nSpecified eBook added to DB!");
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        DBConnection.shutdown();
    }
        
    static void updateEbook(Ebook eb) {
        Connection con;
        Statement stm;
        
        String field = new ValidInput().validInput("ebook_details_to_update");
        
        String toUpdate = null;
        String updateValue = null;
        switch(field) {
            case "title": 
                toUpdate = "TITLE";
                updateValue = new ValidInput().validInput("title");
                break;
            case "numberofpages":
                toUpdate = "NUMBER_OF_PAGES";
                updateValue = new ValidInput().validInput("noofpages");
                break;
            case "rating":
                toUpdate = "RATING";
                updateValue = new ValidInput().validInput("rating");
                break;
            case "price":
                toUpdate = "PRICE";
                updateValue = new ValidInput().validInput("price");
                break;
        }
        
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stm = con.createStatement();
            if (field.equals("title"))
                stm.execute("UPDATE kossT.EBOOKS SET \"" + toUpdate + "\" = '" + updateValue + "' WHERE ISBN = '" + eb.getISBN() + "'");
            else
                stm.execute("UPDATE kossT.EBOOKS SET \"" + toUpdate + "\" = " + updateValue + " WHERE ISBN = '" + eb.getISBN() + "'");
            System.out.println("\nSpecified field updated!");
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        DBConnection.shutdown();
    }
        
    static void deleteEbook(Ebook eb) {
        Connection con;
        Statement stm;
        
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stm = con.createStatement();
            stm.execute("DELETE FROM kossT.EBOOKS WHERE ISBN = '" + eb.getISBN() + "'");
            System.out.println("\nSpecified eBook deleted from DB!");
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        DBConnection.shutdown();
    }
    
    static void selectEbook() {
        Connection con;
        Statement stm;
        ResultSet rs = null;
        
        String field = new ValidInput().validInput("field_to_sort_by");        
        String column = null;
        
        switch(field) {
            case "rating": 
                column = "RATING";
                break;
            case "price":
                column = "PRICE";
                break;
            case "both":
                column = "RATING, PRICE";
                break;
        }        
        System.out.println();
        
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM kossT.EBOOKS ORDER BY " + column);
            boolean tableNotEmpty = rs.next();
            if (tableNotEmpty)
                do {
                    System.out.println(rs.getString(1) + "\t\t"
                            + rs.getString(2) + "\t\t"
                            + rs.getString(3) + "\t\t"
                            + rs.getInt(3) + "\t\t"
                            + rs.getDouble(4) + "\t\t"
                            + rs.getDouble(5) + "\t\t"
                            + "======"
                            + "============================"
                            + "============================");
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
