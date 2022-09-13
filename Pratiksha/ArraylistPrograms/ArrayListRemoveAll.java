package ArraylistPrograms;

import java.util.ArrayList;

public class ArrayListRemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);
		
		

	}

}
