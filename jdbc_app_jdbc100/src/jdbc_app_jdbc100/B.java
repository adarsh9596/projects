package jdbc_app_jdbc100;

//delet the Records to my sql file 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class B {
	
	public static void main(String[] args) {
		
		try {
			
			//first step connect DB
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_database_1","root","adarsh");
			System.out.println(con);
			
			Statement stmnt = con.createStatement();
			
			stmnt.executeUpdate("DELETE FROM student WHERE email='akansha@gmail.com'");
            
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
