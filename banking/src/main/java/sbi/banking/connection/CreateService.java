package sbi.banking.connection;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateService {
	public boolean create() throws SQLException, IOException{
		//DbConnection.dbConn().prepareStatement(insert);
		String insert="insert into emp(name,city,dept,salary) "+ "values(?,?,?,?)";
		
		PreparedStatement ps=DbConnection.dbConn().prepareStatement(insert);
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter Employee name: ");
		String name=s1.next();
		System.out.println("Enter Employee city: ");
		String city=s1.next();
		System.out.println("Enter Employee department: ");
		String dept=s1.next();
		System.out.println("Enter Employee Salary: ");
		float salary=s1.nextFloat();
		
		ps.setString(1, name);
		ps.setString(2, city);
		ps.setString(3, dept);
		ps.setFloat(4, salary);
		ps.executeUpdate();
		return true;
		
	}
}
