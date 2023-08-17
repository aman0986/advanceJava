package in.co.rays.ag;

import java.util.Iterator;
import java.util.List;

public class TestAg {
	public static void main(String[] args) throws Exception {
		testSearch();
		
	}
	private static void testSearch() throws Exception{
		Agbean bean = new Agbean();
		bean.setAg_name("a");
		//bean.setId(5);
		

		AgModel model = new AgModel();
		List list = model.search(bean, 1, 5);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			 bean = (Agbean) it.next();
			System.out.print(bean.getId());
			System.out.println("\t" + bean.getAg_name());
			
		}
		
	}

}
