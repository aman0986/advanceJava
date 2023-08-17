package in.co.rays.user;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import in.co.rays.marksheet.MarksheetModel;
import in.co.rays.test.TestUpdate;

public class TestUser {

	public static void main(String[] args) throws Exception {

		//testAdd();

		//testUpdate();

		//testSearch();
		testDelete();

	}

	private static void testSearch() throws Exception {
		
		String dob = "1997-07-31";
		

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();
		
		bean.setDob(sdf.parse(dob));
		bean.setId(1);
		bean.setFirstName("aman");
		bean.setLastName("gupta");
		bean.setLoginId("aman@gmail.com");
	

		UserModel model = new UserModel();

		List list = model.sreach(bean,1,5);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (UserBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getAddress());

		}

	}

	private static void testUpdate() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.findByPk(1);
		String dob = "1997-07-26";
		

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


		if (bean != null) {

			bean.setFirstName("ram");
			bean.setLastName("gupta");
			bean.setDob(sdf.parse(dob));

			model.update(bean);

			System.out.println("User Exist & Updated");

		} else {
			System.out.println("User not exist...!!!");
		}

	}

	private static void testAdd() throws Exception {

		String dob = "1997-07-31";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();
		//bean.setId(1);
		bean.setFirstName("roshan");
		bean.setLastName("ratnagar");
		mailto:bean.setLoginId("roshan@gmail.com");
		bean.setPassword("1234");
		bean.setDob(sdf.parse(dob));
		bean.setAddress("indore");

		UserModel model = new UserModel();

		model.add(bean);

	}
	private static void testDelete() throws Exception {
		UserModel model = new UserModel();
		model.delete(6);
		
	}

}

