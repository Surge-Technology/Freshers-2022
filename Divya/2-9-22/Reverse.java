package arraylist.com;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	    //Java program to add elements in ArrayList and print them in reverse order
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("divya");
		list.add("mine");
		System.out.println("before reverse");
		System.out.println(list);
        Collections.reverse(list);
        System.out.println("after reverse");
        System.out.println(list);
	}
	

}
