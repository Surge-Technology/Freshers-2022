package ArraylistPrograms;

import java.util.ArrayList;

public class SubList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println("Sub list is" + list.subList(3, 6));

	}

}
