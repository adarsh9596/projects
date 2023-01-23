package jdbc_app_jdbc100;

//modify update  the Records to my sql file 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class C {
	
	public static void main(String[] args) {
		
		try {
			
			//first step connect DB
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_database_1","root","adarsh");
			System.out.println(con);
			
			//create statements
			
			Statement stmnt = con.createStatement();
			
			stmnt.executeUpdate("update student set mobile='7090334176'where email='akansha@gmail.com'");
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
