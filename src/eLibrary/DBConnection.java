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
public class DBConnection {
    
    private static final String URL = "jdbc:derby://localhost:1527/EBOOKSDB;create=true;";
    private static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    private static final String USER = "kossT";
    private static final String PASSWORD = "1411";
    private static final String[] TABLES = {"EBOOKS", "TYPES", "AUTHORS", "RATINGS"};
    
    // jdbc Connection
    private static Connection conn = null;
    private static Statement stm = null;
    
    static void createDB(){
        try{
            Class driver = Class.forName(DRIVER);
            //Get a connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD); 
                  
            for (String table : TABLES)
                if(!checkIfTableCreated(conn, table))
                    createTable(conn, table);
        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver missing!");
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        finally {
            if (conn != null)
                try {
                    conn.close();
                }
                catch (SQLException e) {
                    System.out.println("Error when trying to close connection!");
                }
        }
    }
    
    static boolean checkIfTableCreated(Connection con, String table) {
        boolean alreadyCreated = false;
        try{
            ResultSet rs = con.getMetaData().getTables(null, null, table, null);
            while (rs.next()) { 
                String tableName = rs.getString("TABLE_NAME");
                if ((tableName != null) && (tableName.equalsIgnoreCase(table))){
                    alreadyCreated = true;
                    break;
                }
            }
        }
        catch (SQLException e) { 
            System.out.println(e);
        }
        return alreadyCreated;
    }
    
    static void createTable(Connection con, String table) {
        try{
            stm = con.createStatement();
            switch(table) {
                case "EBOOKS" :
                    stm.execute("CREATE TABLE EBOOKS ("
                            + "ISBN VARCHAR(16) NOT NULL, "
                            + "TITLE VARCHAR(64) NOT NULL, "
                            + "SUBCATEGORY VARCHAR(24) NOT NULL, "
                            + "NUMBER_OF_PAGES INTEGER NOT NULL, "
                            + "RATING DOUBLE NOT NULL, "
                            + "PRICE DOUBLE NOT NULL, "
                            + "PRIMARY KEY (ISBN))");
                    break;
                case "TYPES" :
                    stm.execute("CREATE TABLE TYPES ("
                            + "ID INTEGER NOT NULL, "
                            + "NAME VARCHAR(32) NOT NULL, "
                            + "PRIMARY KEY (ID))");
                    stm.execute("INSERT INTO TYPES (ID, NAME) VALUES "
                            + "(1, 'Technical'), "
                            + "(2, 'Novel'), "
                            + "(3, 'Art Album')");
                    break;
                case "AUTHORS" :
                    stm.execute("CREATE TABLE AUTHORS ("
                            + "ISBN VARCHAR(16) NOT NULL, "
                            + "ID INTEGER NOT NULL, "
                            + "NAME VARCHAR(32) NOT NULL, "
                            + "SURNAME VARCHAR(32) NOT NULL, "
                            + "PRIMARY KEY (ISBN, ID))");                    
                    break;                
                case "RATINGS" :
                    stm.execute("CREATE TABLE RATINGS ("
                            + "ISBN VARCHAR(16) NOT NULL, "
                            + "USER_ID INTEGER NOT NULL, "
                            + "RATING DOUBLE NOT NULL, "
                            + "DESCRIPTION VARCHAR(255) NOT NULL, "
                            + "PRIMARY KEY (ISBN, USER_ID))");
                    break;                
                default :
                    break;
            }
        }
        catch (SQLException e) {
            System.out.println("Error creating table " + table);
        }
        finally {
            if (stm != null)
                try {
                    stm.close();
                }
                catch (SQLException e) {
                    System.out.println("Error closing statement!");
                }
        }
    }
    
    static void shutdown(){
        if (stm != null)
                try {
                    stm.close();
                }
                catch (SQLException e) {
                    System.out.println("Error closing statement!");
                }
        if (conn != null)
                try {
                    conn.close();
                }
                catch (SQLException e) {
                    System.out.println("Error when trying to close connection!");
                }
    }
    
}
    
 
