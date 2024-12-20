package inteviewpractice.DatabaseOperation_JDBC.UsingPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {

	public static void main(String[] args) {
	
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Interviewpractice", "root", "admin");
			String sql="insert into user (id,lastname, firstname, Address) values(?,?,?,?)";
			PreparedStatement ptmt=conn.prepareStatement(sql);
			
			ptmt.setInt(1, 7);
			ptmt.setString(2, "Chavan");
			ptmt.setString(3, "Divakar");
			ptmt.setString(4, "Gursale");
			
			int count=ptmt.executeUpdate();
			System.out.println("Record inserted: "+count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
