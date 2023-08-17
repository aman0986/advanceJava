package in.co.rays.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.co.rays.util.JDBCDataSource;

public class BankModel {
	public void add(BankBean bean)throws Exception {
		
		Connection conn = JDBCDataSource.getconnection();
		 PreparedStatement ps = conn.prepareStatement("insert into bank  values(?,?,?,?,?,?,?,?)");
		 
		 ps.setInt(1, bean.getId());
		 ps.setString(2, bean.getFirstname());
		 ps.setString(3, bean.getLastname());
		 ps.setInt(4, bean.getAccountno());
		 ps.setInt(5, bean.getMobileno());
		 ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
		 ps.setString(7, bean.getAddress());
		 ps.setString(8, bean.getBranchname());
		 
		 int i = ps.executeUpdate();
		 System.out.println("data update ="+i);
	}
	
	public Integer Pk()throws Exception{
		
		
		int pk = 0;
		Connection conn = JDBCDataSource.getconnection();
		PreparedStatement ps = conn.prepareStatement(" select max(id) from user ");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			pk = rs.getInt(1);
			
			
		}
		
		
		return pk+1;
		
	}
	public void update(BankBean bean) throws Exception {
		Connection conn = JDBCDataSource.getconnection();
		PreparedStatement ps = conn.prepareStatement("update user set first_name = ?, last_name = ? , account_no = ?, mobile_no = ?, dob = ?, address = ?, branch_name = ?, where id= ?");
		ps.setString(1, bean.getFirstname());
		ps.setString(2, bean.getLastname());
		ps.setInt(3, bean.getAccountno());
		ps.setInt(4, bean.getMobileno());
		ps.setDate(5, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(6, bean.getAddress());
		ps.setString(7, bean.getBranchname());
		ps.setInt(8, bean.getId());
		
		int i = ps.executeUpdate();
		System.out.println("Bank update" + i);
		
	}
	public BankBean findBypk(int id )throws Exception {
	Connection conn = JDBCDataSource.getconnection();
	PreparedStatement ps = conn.prepareStatement("selct * from bank where id = ?");
	ps.setInt(1, id);
	ResultSet rs = ps.executeQuery();
	BankBean bean = null;
	while (rs.next()) {
		bean = new BankBean();
		bean.setId(rs.getInt(1));
		bean.setFirstname(rs.getString(2));
		bean.setLastname(rs.getString(3));
		bean.setAccountno(rs.getInt(4));
		bean.setMobileno(rs.getInt(5));
		bean.setDob(rs.getDate(6));
		bean.setAddress(rs.getString(7));
		bean.setBranchname(rs.getString(8));
		
	}
	
	
		
		return bean;
		
	}

	

	

}
