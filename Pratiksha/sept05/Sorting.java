package sept05;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(22);
		list.add(32);
		list.add(67);
		list.add(55);
		Collections.sort(list);
		System.out.println("sorted list:"+ list);

	}

}
