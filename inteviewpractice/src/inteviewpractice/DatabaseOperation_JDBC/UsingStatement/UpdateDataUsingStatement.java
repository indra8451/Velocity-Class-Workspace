package inteviewpractice.DatabaseOperation_JDBC.UsingStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDataUsingStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Interviewpractice", "root", "admin");
		
		Statement stmt=conn.createStatement();
		
		String sql="update user set firstname='Karn' where id=5";
		
		stmt.executeUpdate(sql);
		
		System.out.println("updated successfully");

	}

}
