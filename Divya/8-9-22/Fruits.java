package arraylist.com;

import java.util.Arrays;
import java.util.Collections;

//List->1. write a program ascending and descending order for using 
//list of string?{"apple","mango","orange","Guava"}



public class Fruits {

	public static void main(String[] args) {
		String[]fruit={"apple","guova","mango","orange"};
		Arrays.sort(fruit);
		System.out.print("ascending order");
		System.out.println(Arrays.toString(fruit));
		Arrays.sort(fruit,Collections.reverseOrder());
		System.out.print("decending order");
		System.out.println(Arrays.toString(fruit));

	}

}
