import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTesting {

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://" + "localhost" + ":" + "3306" + "/Qadbt", "root","May@2020");
	
		Statement createStatement = connection.createStatement();
		
		ResultSet resultSet = createStatement.executeQuery("select * from Employeeinfo where age='23';");
	
		resultSet.next();
		
		String name = resultSet.getString("name");
		
		String id = resultSet.getString("id");
		
		System.out.println(id+ "-->"+name);
		
		
	
	
	
	}

}
