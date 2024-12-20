package inteviewpractice.DatabaseOperation_JDBC.UsingPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Interviewpractice", "root", "admin");
		String sql="update user set lastname=?,firstname=? where id=?";
		PreparedStatement ptmt=conn.prepareCall(sql);
		
		ptmt.setString(1, "dhere");
		ptmt.setString(2, "sandip");
		ptmt.setInt(3, 3);
		
		
		int count=ptmt.executeUpdate();
		System.out.println("Record Updated: "+count);
	}

}
