package assesment050922;

import java.util.ArrayList;

public class EvenNumberFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		for (int i = 1; i <= list.size(); i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

	}
}
