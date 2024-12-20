package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retreval {

    public static void main(String[] args) throws SQLException {
    
        // First approach: Using Statement object for retrieving records
        /*try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish a connection to the MySQL database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/velocity", "root", "admin");
            
            // Create a statement object to execute SQL queries
            Statement stmt = conn.createStatement();
            
            // Define the SQL SELECT query
            String sql = "SELECT * FROM employee";
            
            // Execute the SQL SELECT query and retrieve the result set
            ResultSet rs = stmt.executeQuery(sql);
            
            // Iterate through the result set and print each record
            while (rs.next()) {
                System.out.println("**************************");
                System.out.println(rs.getInt(1));  // Print empID
                System.out.println(rs.getString(2));  // Print name
                System.out.println(rs.getString(3));  // Print email
            }
            
            // Close the resources
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (ClassNotFoundException e) {
            // Handle the case where the JDBC driver class is not found
            e.printStackTrace();
        }*/

        // Second approach: Using PreparedStatement for retrieving records
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish a connection to the MySQL database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/velocity", "root", "admin");
            
            // Define the SQL SELECT query
            String sql = "SELECT * FROM employee";
            
            // Create a statement object to execute SQL queries
            Statement stmt = conn.prepareStatement(sql);
            
            // Execute the SQL SELECT query and retrieve the result set
            ResultSet rs = stmt.executeQuery(sql);
            
            // Iterate through the result set and print each record
            while (rs.next()) {
                System.out.println("**************************");
                System.out.println(rs.getInt(1));  // Print empID
                System.out.println(rs.getString(2));  // Print name
                System.out.println(rs.getString(3));  // Print email
            }
            
            // Close the resources
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (ClassNotFoundException e) {
            // Handle the case where the JDBC driver class is not found
            e.printStackTrace();
        }
    }
}
