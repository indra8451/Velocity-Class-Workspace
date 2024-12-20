package inteviewpractice.DatabaseOperation_JDBC.UsingPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertingDynamicValuesOfUser {
	
	public static void insertUsers(int id,String lastname,String firstname,String address) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Interviewpractice", "root", "admin");
			
			String sql="insert into user (id,lastname, firstname, Address) values(?,?,?,?)";
			PreparedStatement ptmt=conn.prepareStatement(sql);
			
			ptmt.setInt(1, id);
			ptmt.setString(2, lastname);
			ptmt.setString(3, firstname);
			ptmt.setString(4, address);
			
			int count=ptmt.executeUpdate();
			System.out.println("Record inserted: "+count);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the ID of User: ");
		int id=scanner.nextInt();
		
		System.out.println("Enter Lastname of User: ");
		String lastname=scanner.next();
		
		System.out.println("Enter Firstname of User: ");
		String firstname=scanner.next();
		
		System.out.println("Enter address of User: ");
		String address=scanner.next();
		
		insertUsers(id, lastname, firstname, address);
		scanner.close();

	}

}
