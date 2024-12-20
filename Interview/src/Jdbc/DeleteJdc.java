package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteJdc {

    public static void main(String[] args) throws SQLException {

        // First approach: Using Statement object for deleting a record
        /*try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the MySQL database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/velocity", "root", "admin");

            // Create a statement object to execute SQL queries
            Statement stmt = conn.createStatement();

            // Define the SQL DELETE query
            String sql = "DELETE FROM employee WHERE empID=5";

            // Execute the SQL DELETE query
            int i=stmt.executeUpdate(sql);
            System.out.println("record Deleted Sucessfully"+i);

            // Print confirmation message
            System.out.println("Record is deleted");

            // Close the resources
            conn.close();
            stmt.close();

        } catch (ClassNotFoundException e) {
            // Handle the case where the JDBC driver class is not found
            e.printStackTrace();
        }*/

        // Second approach: Using PreparedStatement for deleting a record
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the MySQL database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/velocity", "root", "admin");

            // Define the SQL DELETE query with a placeholder for the empID
            String sql = "DELETE FROM employee WHERE empID=?";

            // Prepare the SQL query
            PreparedStatement ps = conn.prepareStatement(sql);

            // Set the value for the placeholder (parameter)
            ps.setInt(1, 1005);

            // Execute the SQL DELETE query
            ps.executeUpdate();

            // Print confirmation message
            System.out.println("Record is deleted");

            // Close the resources
            ps.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            // Handle the case where the JDBC driver class is not found
            e.printStackTrace();
        }
    }
}
