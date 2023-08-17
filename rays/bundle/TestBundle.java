package in.co.rays.bundle;

import java.util.ResourceBundle;

public class TestBundle {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.app_sp");
		ResourceBundle rb1 = ResourceBundle.getBundle("in.co.rays.bundle.app_hi");
		ResourceBundle rb2 = ResourceBundle.getBundle("in.co.rays.bundle.app");
		ResourceBundle rb3 = ResourceBundle.getBundle("in.co.rays.bundle.app_hi");
		System.out.println(rb.getString("spl"));
		System.out.println(rb1.getString("greeting"));
		System.out.println(rb2.getString("Driver"));
		System.out.println(rb3.getString("pun"));
		
//		System.out.println(rb.getString("url"));
//		System.out.println(rb.getString("user"));
//		System.out.println(rb.getString("password"));
//		System.out.println(Integer.parseInt(rb.getString("initial")));
//		System.out.println(Integer.parseInt(rb.getString("acquire")));
//		System.out.println(Integer.parseInt(rb.getString("maximum")));
		
	}

}
