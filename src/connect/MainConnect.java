package connect;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainConnect {

	public static void main(String[] args) {
		System.out.println("Hello JDBC");
		DatabaseConnect dc = new DatabaseConnect("localhost:1433","project","sa","123456");
		
		try {
			Connection connection = dc.getConnection();
			Statement statement = (Statement) connection.createStatement();
			String sql = "SELECT * FROM TextBook";
			ResultSet resultSet = statement.excuteQuery(sql);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("email"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
