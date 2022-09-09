package ArraylistPrograms;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator itr = (Iterator) list.iterator();
		System.out.println("List is:"+itr);
		
		

}

	

	
	
}