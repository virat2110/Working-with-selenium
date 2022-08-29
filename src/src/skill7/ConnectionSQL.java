package src.skill7;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionSQL {
	public static Connection connection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/selenium";
		String user = "root";
		String password = "12345";
		try {
			con = DriverManager.getConnection(url, user,password);
			return con;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

}
