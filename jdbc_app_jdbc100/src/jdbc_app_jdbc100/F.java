package jdbc_app_jdbc100;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class F{
	
	public static void main(String[] args) {
		Connection con =null;
		try {
			//connection DB start
			 con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_database_1","root","adarsh");
			System.out.println(con);
			
			Statement stmnt = con.createStatement();
			
			stmnt.executeUpdate("insert into student values('akansha','bangalore','akansha@gmail.com','7090334184')");
			
			//connection DB Stops 
		} catch (Exception e1) {
			e.printStackTrace();//exception bolte hai  e.printstacktrace maybe
		}finally {
			try {
			con.close();
			con=null;
			System.out.println(con);
			
				// ek baar dekhna plzzz yra 
			}}}}}}


