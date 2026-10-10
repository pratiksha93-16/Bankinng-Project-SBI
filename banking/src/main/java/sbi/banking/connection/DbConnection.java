package sbi.banking.connection;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	
	public static Connection dbConn() throws IOException, SQLException {
		File f1=new File("C:\\Users\\Pratiksha\\eclipse-workspace\\banking\\src\\main\\java\\db.properties");
		FileInputStream f2=new FileInputStream(f1);
		Properties p1=new Properties();
		p1.load(f2);
		String user=p1.getProperty("user");
		String url=p1.getProperty("url");
		String password=p1.getProperty("password");
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Done");
		return con;
	}
}
