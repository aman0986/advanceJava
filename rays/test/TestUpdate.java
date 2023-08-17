package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdate {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate(" update marksheet set name = 'rakesh' where id = 16");
		
		
		System.out.println("Data update="+i);


	}

}
