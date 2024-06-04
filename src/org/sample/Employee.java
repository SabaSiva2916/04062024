package org.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
// Connection
	Class.forName("oracle.jdbc.driver.OracleDriver");
//DriverManager
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
//Writing query	
	String sql = "select * from employees";

	// Preprare Statement
	PreparedStatement prepareStatement = con.prepareStatement(sql);

	// Execute quert
	ResultSet executeQuery = prepareStatement.executeQuery();

	// iterate result
	while (executeQuery.next()) {

	    int empId = executeQuery.getInt("employee_id");
	    String fn = executeQuery.getString("first_name");
	    System.out.println(empId + "  " + fn);
	}

	con.close();

    }
}
