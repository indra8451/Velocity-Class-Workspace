package inteviewpractice.DatabaseOperation_JDBC.UsingStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class SelectDataUsingStatement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Interviewpractice", "root", "admin");
		
		Statement stmt=conn.createStatement();
		
		String sql="select * from user";
		
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			
			System.out.println("Id: "+rs.getInt(1));
			System.out.println("firstName: "+ rs.getString(3));
			
		}
		

	}

}
