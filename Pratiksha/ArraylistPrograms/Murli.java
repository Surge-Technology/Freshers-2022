package ArraylistPrograms;

import java.util.ArrayList;

public class Murli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("pratiksha");
		list.add("joshi");
		list.add("akhila");
		list.add("manju");
		System.out.println(list);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("divya");
		list2.add("bala");
		list2.add("joshi");
		list2.add("sneha");
		System.out.println(list2);
		list.retainAll(list2);
		System.out.println("Common elements:"+list);
		
		

	



	}

}
