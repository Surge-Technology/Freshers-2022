package Sangita;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("dell");
		list.add("lenovo");
		list.add("apple");
		list.add("hp");
		System.out.println("List elements are:"+list);
		String[] myArray = new String[list.size()];
		list.toArray(myArray);
		for(int i=0;i<myArray.length;i++) {
			System.out.println("Element at index"+i+"::"+myArray[i]);
		}
	}

}
