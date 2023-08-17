package in.co.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args)throws Exception{
		testAdd();
		 //testUpdate();
		//testDelete();
		//testFindbyRoll();
		//testSearch();
		
	}
//	private static void testSearch() throws Exception {
//		MarksheetModel model = new MarksheetModel();
//		List list = model.search();
//		Iterator it = list.iterator();
//		while (it.hasNext()) {
//			
//			MarksheetBean bean =(MarksheetBean) it.next();
//			System.out.println(bean.getId());
//			System.out.println("\t"+bean.getName());
//			System.out.println("\t"+bean.getRollNo());
//			System.out.println("\t"+bean.getPhysics());
//			System.out.println("\t"+bean.getChemistry());
//			System.out.println("\t"+bean.getMaths());
//			
//		}
//		
//	}
	private static void testSearch() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		bean.setName("r");
		 bean.setId(1);
		 bean.setRollNo(101);

		MarksheetModel model = new MarksheetModel();

		List list = model.search(bean, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (MarksheetBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		}

	}

	private static void testFindbyRoll()throws Exception {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = model.findByRoll(102);
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getRollNo());
		System.out.println(bean.getPhysics());
		System.out.println(bean.getChemistry());
		System.out.println(bean.getMaths());
		
		
	}
	private static void testAdd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(2);
		bean.setName("aamisha");
		bean.setRollNo(102);
		bean.setPhysics(99);
		bean.setChemistry(89);
		bean.setMaths(88);
		
		MarksheetModel model = new MarksheetModel();
		model.Add(bean);
		
	}
	private static void testDelete() throws Exception {
		MarksheetModel model = new MarksheetModel();
		
		model.delete(2);
		
		
		
		
	}
	private static void  testUpdate() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(34);
		bean.setName("ram");
		bean.setRollNo(134);
		bean.setPhysics(90);
		bean.setChemistry(80);
		bean.setMaths(80);
		MarksheetModel model = new MarksheetModel();
		
		model.update(bean);
		
	}
	
		
	}

