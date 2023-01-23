package jdbc_app_jdbc100;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class A {
	
	public static void main(String[] args) {
		
		try {
			
			//first step connect DB
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_database_1","root","adarsh");
		
			System.out.println(con);
			
			Statement stmnt = con.createStatement();
			
			stmnt.executeUpdate("insert into student values('akansha','bangalore','akansha@gmail.com','7090334184')");
		
		//close DB connections 
		con.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
