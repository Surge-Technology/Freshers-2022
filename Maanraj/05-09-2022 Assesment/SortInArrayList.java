package assesment050922;

import java.util.ArrayList;
import java.util.Collections;

public class SortInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(40);
		list.add(10);
		list.add(50);
		list.add(20);
		list.add(30);
		System.out.println("Before" + list);
		Collections.sort(list);
		System.out.println("After" + list);

	}

}
