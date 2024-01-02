package empregistation.dao;

import java.sql.*;
import empregistation.model.Employee;

public class EmployeeDao {
	public int registerEmployee(Employee employee) throws ClassNotFoundException{
		String INSERT_USERS_SQL ="INSERT INTO employee.emp"+" (ename, ephone, email) VALUES "+"(?,?,?);";
		
		int result=0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3066/employee", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
			preparedStatement.setString(1, employee.getEname());
			preparedStatement.setString(2, employee.getEphone());
			preparedStatement.setString(3, employee.getEmail());
			
			System.out.println(preparedStatement);
			
			result = preparedStatement.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
