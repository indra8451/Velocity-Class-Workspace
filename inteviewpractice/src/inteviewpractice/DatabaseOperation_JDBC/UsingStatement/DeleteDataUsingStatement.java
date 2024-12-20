package inteviewpractice.DatabaseOperation_JDBC.UsingStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDataUsingStatement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Interviewpractice", "root", "admin");
		
		Statement stmt=conn.createStatement();
		
		String sql="delete from user where id=7";
		
		stmt.execute(sql);
		
		System.out.println("Deleted successfully");
		
	}

}
