package inteviewpractice.DatabaseOperation_JDBC.UsingStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataUsingStatement {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Interviewpractice", "root",
					"admin");

			Statement stmt = conn.createStatement();

			String sql = "insert into user (id,lastname, firstname, Address) values(7,'Khan','Shera','Daund')";

			stmt.execute(sql);

			System.out.println("Inserted");

		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

}