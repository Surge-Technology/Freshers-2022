package Surge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {

		Integer[] array = { 70, 20, 30, 50, 50, 60, 56, 70, 70, 30 };
		
		List<Integer> s = Arrays.asList(array);

		List<Integer> list = new ArrayList<Integer>(s);

		Set<Integer> set = new HashSet<Integer>(list);

		System.out.println(set);

	}

}
