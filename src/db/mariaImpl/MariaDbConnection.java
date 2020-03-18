package db.mariaImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbConnection{
	
	String url = "jdbc:mariadb://localhost:3306/the_boomer_war";
	String usr = "root";
	String psw = "";
	
	
	public Connection open() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,usr,psw);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}

}
