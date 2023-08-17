package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestCreateTable {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("create table nothing(id int primary key, name varchar(50),salary int)");
		System.out.println(i);
		
	}

}
