package renuka;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		ArrayList<Integer> sort=new ArrayList<Integer>();
		sort.add(23);
		sort.add(3);
		sort.add(13);
		sort.add(45);
		sort.add(67);
		sort.add(88);
		sort.add(55);
		System.out.println("List of numbers"+sort);
		Collections.sort(sort);
		System.out.println("Sorted Numbers are: " +sort);
	
	}

}
