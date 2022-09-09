package arraylist;

import java.util.ArrayList;
import java.util.List;

public class SUblist {
	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		aList.add("Apple");
		aList.add("Mango");
		aList.add("Banana");
		aList.add("Melon");
		aList.add("Orange");
		aList.add("Grapes");
		aList.add("Peach");
		List sList = aList.subList(2, 6);
		System.out.println("The sub-list elements are: ");
		System.out.println(sList);
	}
}