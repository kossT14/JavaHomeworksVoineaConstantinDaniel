/*
 * Class TestDatabase
 */
package test_database;
import java.sql.*;

/**
 * Implementation to test the existence of a database  
 * @author kossT
 */
public class TestDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            // get driver class name
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // open connection using db url
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/FIRSTDB","kossT", "noiembrie14");
            Statement st = con.createStatement();
            
            //Sql statement
            ResultSet rs = st.executeQuery("Select * from kossT.FIRSTTABLE");
            
            // get more info about table
            ResultSetMetaData meta = rs.getMetaData();
            
            // write column name
            for (int i = 1; i <= meta.getColumnCount(); i++){
                System.out.printf("%-10s\t", meta.getColumnName(i));
                
            }
            System.out.println();
            
            // write data
            while (rs.next()){
                for (int i = 1; i <= meta.getColumnCount(); i++){
                System.out.printf("%-10s\t", rs.getObject(i));
                
                }
                System.out.println();
            }
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.print(e);
        }
    }
    
}
