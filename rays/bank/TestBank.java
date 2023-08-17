package in.co.rays.bank;


import java.text.SimpleDateFormat;



import in.co.rays.test.TestAdd;

public class TestBank {

	public static void main(String[] args) throws Exception {
		//TestAdd();
		//testpk();
		testupdate();
	}

	private static void testupdate() throws Exception {
		
		BankModel model = new BankModel();
		BankBean bean = model.findBypk(1);
		String dob = "1997-05-25";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		if (bean != null) {
			bean.setFirstname("raju");
			bean.setLastname("sharma");
			bean.setDob(sdf.parse(dob));
			model.update(bean);
			System.out.println("bank exit & updated");
			
			
		} else {
			System.out.println("bank not exist.....!!!-)");

		}  
		
		
	}

//	private static void testpk() throws Exception {
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		String dob = "1997-07-20";
//		BankBean bean = new BankBean();
//		bean.setId(4);
//		bean.setFirstname("ram");
//		bean.setLastname("gupta");
//		bean.setAccountno(1245124512);
//		bean.setMobileno(845825852);
//		bean.setDob(sdf.parse(dob));
//		bean.setAddress("indore");
//		bean.setBranchname("punb indores");
//		BankModel model = new BankModel();
//		model.add(bean);
//		
//	}

	private static void TestAdd() throws Exception {
		BankBean bean = new BankBean();
		String dob = "1997-07-26";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setId(4);
		bean.setFirstname("aman");
		bean.setLastname("gupta");
		bean.setAccountno(1234567890);
		bean.setMobileno(1234567891);
		bean.setDob(sdf.parse(dob));
		bean.setAddress("indore");
		bean.setBranchname("sbi indore");
		
		BankModel model = new BankModel();
		model.add(bean);
		
	}
	
	
	

}
