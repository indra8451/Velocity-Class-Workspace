package inteviewpractice.DatabaseOperation_JDBC.UsingPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Interviewpractice", "root", "admin");
		String sql="delete from user where id=?";
		PreparedStatement ptmt=conn.prepareStatement(sql);
		
		ptmt.setInt(1, 7);
		
		int count=ptmt.executeUpdate();
		System.out.println("Record Deleted: "+count);
		
	}

}
