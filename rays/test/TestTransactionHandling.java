package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestTransactionHandling {

	public static void main(String[] args) throws Exception{
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
			 conn.setAutoCommit(false);
			 Statement stmt = conn.createStatement();
			int i = stmt.executeUpdate(" insert into marksheet values(31,'ramanand',116,80,70,84)");
			i = stmt.executeUpdate(" insert into marksheet values(32,'ramanand',116,80,70,84)");
			i = stmt.executeUpdate(" insert into marksheet values(33,'ramanand',116,80,70,84)");
			i = stmt.executeUpdate(" insert into marksheet values(33,'ramanand',116,80,70,84)");
			conn.commit();
			
			
		} catch (Exception e) {
			conn.rollback();
			System.out.println(e);
		}
	
	
	
	
	
	}

}
