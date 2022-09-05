package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListandprinttheminreverseorder {
     	public static void main(String[] args) {
			 ArrayList<String> list=new ArrayList<String>();
			 list.add("Maan4raj3");
			 list.add("Madan5kumar5");
			 list.add("Rakesh6anand5");
			 System.out.println(" before reverse"+list);
			 Collections.reverse(list);
			 System.out.println("After reverse"+list);
			 
		}
}

