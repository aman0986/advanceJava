package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class TestSelect {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select name from marksheet where id = 16");
		while (rs.next()) {
			//System.out.println(rs.getInt(1));
			System.out.println(rs.getString(1));
			//System.out.println(rs.getInt(3));
			//System.out.println(rs.getInt(4));
			//System.out.println(rs.getInt(5));
			
		}
		



	}

}
