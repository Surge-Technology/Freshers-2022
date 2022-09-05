package arraylist;

import java.util.ArrayList;

public class ReplaceelementwithintheArrayList {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("JavaScript");
		list.add("Java");
		list.add("WebTech");
		list.add("C++");
		System.out.println(list);
		list.set(2, "Html");
		System.out.println(list);
	}
}
