package arraylist.com;

import java.util.ArrayList;
import java.util.List;


//Java program to create a sub list from an ArrayList
public class Sublist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList alist=new ArrayList();
		alist.add("lilly");
		alist.add("banana");
		alist.add("apple");
		alist.add("dog");
		List A=alist.subList(1, 3);
		for(int i=0;i<A.size();i++) {
			System.out.println(A.get(i));
		

//Java program to search an element from an ArrayList
			int index1=alist.indexOf("lilly");
			if(index1==-1) 
				System.out.println("dog is not in arraylist");
			else
				System.out.println("dog in arraylist"+index1);
			}
			}
			
			
			
			
			
		
	}

}
