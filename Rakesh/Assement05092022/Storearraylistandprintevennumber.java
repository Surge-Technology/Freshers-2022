package test05092022;

import java.util.ArrayList;

//c
public class Storearraylistandprintevennumber {
	public static void main(String[] args) {
		ArrayList<Integer> even = new ArrayList<Integer>();
		even.add(1);
		even.add(2);
		even.add(3);
		even.add(4);
		even.add(5);
		even.add(6);
		even.add(7);
		even.add(8);
		even.add(9);
		even.add(10);
		System.out.println("Before");
		System.out.println(even);
		System.out.println("after");
		for (int i = 1; i <= even.size(); i++) {
			
			if (i % 2 == 0) {
				
				System.out.println(i);
			}
		}
	}
}
