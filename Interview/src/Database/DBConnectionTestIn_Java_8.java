package Database;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTestIn_Java_8 {
	public static void main(String[] args) throws SQLException {
		DriverManager.getConnection("test");
	}

}
