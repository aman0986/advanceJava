package in.co.rays.ag;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class AgModel {
	
	//public List search(Agbean bean, int pageNo, int pageSize)throws Exception {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
	     //StringBuffer sb = new StringBuffer(" Select * from ag where 1 = 1 ");

		//if (bean != null) {

			//if (bean.getAg_name() != null && bean.getAg_name().length() > 0) {

//				sb.append(" and name like '" + bean.getAg_name() + "%'");
//
//			}
//			if (bean.getId() != 0 && bean.getId() > 0) {
//
//				sb.append(" and id = " + bean.getId());
//
//			}
//
//			
//		}
//
//		if (pageSize > 0) {
//
//			pageNo = (pageNo - 1) * pageSize;
//
//			sb.append(" limit " + pageNo + ", " + pageSize);
//
//		}
//
//		System.out.println(sb.toString());
//
//		 PreparedStatement ps = conn.prepareStatement(sb.toString());
//		ResultSet rs = ps.executeQuery();
//		List list = new ArrayList();
//		while (rs.next()) {
//		    bean = new Agbean();
//			bean.setId(rs.getInt(1));
//			bean.setAg_name(rs.getString(2));
//			list.add(bean);
//			
//		}
//		return list;
//		
//	}
//
	public List search(Agbean bean, int pageNo, int pageSize) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");

		StringBuffer sql = new StringBuffer("select * from ag where 1=1");

		if (bean != null) {

			if (bean.getAg_name() != null && bean.getAg_name().length() > 0) {

				sql.append(" and ag_name like '" + bean.getAg_name() + "%'");

			}
			if (bean.getId() != 0 && bean.getId() > 0) {

				sql.append(" and id = " + bean.getId());

			}

		}

		if (pageSize > 0) {

			pageNo = (pageNo - 1) * pageSize;

			sql.append(" limit " + pageNo + ", " + pageSize);

		}

		System.out.println(sql.toString());

		PreparedStatement ps = conn.prepareStatement(sql.toString());

		ResultSet rs = ps.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {

			bean = new Agbean();
			bean.setId(rs.getInt(1));
			bean.setAg_name(rs.getString(2));

			list.add(bean);
		}

		return list;

	}
}
