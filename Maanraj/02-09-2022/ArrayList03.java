package arrayList.com;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList03 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("Before Reverse"+list);
		Collections.reverse(list);
		System.out.println("After Reverse"+list);

	}

}
