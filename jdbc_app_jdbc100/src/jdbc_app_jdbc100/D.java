
package jdbc_app_jdbc100;

//i will given to CRUD operation only chamge Stmnt file mai hoga  

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class D {
	
	public static void main(String[] args) {
		
		try {
			
			//first step connect DB
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_database_1","root","adarsh");
			
			
			//create statements
			
			Statement stmnt = con.createStatement();
			
		 ResultSet result = stmnt.executeQuery("select * from test_database_1.student");
		
		while(result.next()) { // jitna table mai data hoga utna tym print hoga result. 3 tym true because number of table 3 r8
			System.out.println(result.getString(1));//phele tha yeah== System.out.println(100);
			System.out.println(result.getString(2));
			System.out.println(result.getString(3)); // read kr liya database sara text ko samja babu
			System.out.println(result.getString(4));
			//result.getSt automatic aa jayega yara
		}
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println();
		}
	}

}
