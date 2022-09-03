package collection;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mylist=new ArrayList<Integer>();
		mylist.add(100);
		mylist.add(75);
		mylist.add(50);
		mylist.add(25);
		mylist.add(1);
		System.out.println(mylist);
		
		
		
		//reverse order
		Collections.reverse(mylist);
		System.out.println("reverse Order: "+mylist);
		
		
		//remove the specific index
		mylist.remove(4);
		System.out.println("Remove specific index: "+mylist);
		
		//removeAll from the list
		mylist.removeAll(mylist);
		System.out.println("Remove all elements in the list: "+mylist);
		
		
	}

}
