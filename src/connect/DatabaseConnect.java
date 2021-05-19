package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DatabaseConnect {
	private final String url;
	private final Properties properties;
	
	public DatabaseConnect(String host, String databaseName, String username, String password) {
		this.url = "jdbc:mysql://" + host + "/" + databaseName;
		this.properties = new Properties();
		properties.setProperty("user",username);
		properties.setProperty("password",password);		
	}
	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(this.url, properties);
	}
}
