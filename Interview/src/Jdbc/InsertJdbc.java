package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJdbc {

    public static void main(String[] args) throws SQLException {

        // First approach: Using Statement object for inserting a record
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the MySQL database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/velocity", "root", "admin");

            // Create a statement object to execute SQL queries
            Statement stmt = conn.createStatement();

            // Define the SQL INSERT query
            String sql = "INSERT INTO employee(empID, name, email) VALUES (5, 'Vikram', 'Vikram@gmail.com')";

            // Execute the SQL INSERT query
            int i=stmt.executeUpdate(sql);
            System.out.println("record Inserted Sucessfully"+i);
            // Close the resources
            conn.close();
            stmt.close();

        } catch (ClassNotFoundException e) {
            // Handle the case where the JDBC driver class is not found
            e.printStackTrace();
        }

        // Second approach: Using PreparedStatement for inserting a record
        /*try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the MySQL database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/velocity", "root", "admin");

            // Define the SQL INSERT query with placeholders for parameters
            String sql = "INSERT INTO employee(empID, name, email) VALUES (?, ?, ?)";

            // Prepare the SQL query
            PreparedStatement prepareStatement = conn.prepareStatement(sql);

            // Set the parameter values for the prepared statement
            prepareStatement.setInt(1, 1005);
            prepareStatement.setString(2, "Pravin");
            prepareStatement.setString(3, "Pravin@gmail.com");

            // Execute the SQL INSERT query
            int i = prepareStatement.executeUpdate();
            System.out.println("Record is inserted. Rows affected: " + i);

            // Close the resources
            prepareStatement.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            // Handle the case where the JDBC driver class is not found
            e.printStackTrace();
        }
    }*/
}
}
