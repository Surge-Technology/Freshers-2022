package arraylist.com;

import java.util.ArrayList;
import java.util.List;

public class Arrayextract {

//How to extract some of the elements from given list in java?	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> b=new ArrayList<String>();
		b.add("one");
		b.add("two");
		b.add("three");
		System.out.println("original list:" +b);
		List<String> sublist=b.subList(0,2);
		System.out.println("list of 3 element:"+sublist);
	}

}
