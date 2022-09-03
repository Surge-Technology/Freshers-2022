package arraylist.com;

import java.util.ArrayList;

public class SpecificIndex {

	public static void main(String[] args) {
		ArrayList<String>namelist= new ArrayList<String>();
		namelist.add( "divya");
		namelist.add( "manju");
		namelist.add( "bala");
		
		System.out.println(namelist);
		namelist.remove(1);
		System.out.println(namelist);

	}

}


//Java program to add element at specific index in ArrayList