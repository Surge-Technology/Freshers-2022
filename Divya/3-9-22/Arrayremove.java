package arraylist.com;

import java.util.ArrayList;

public class Arrayremove {


//java program to remove all elements from an arraylist	
	
	
	
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("rose");
		list.add("jasmine");
		list.add("lilly");
		System.out.println(list);
		list.clear();
	    System.out.println();
		
	    //extract element
	    String element=list.get(2);
	    System.out.println(element);
	    
	    
	    
	}

}
