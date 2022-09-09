package Sangita;

import java.util.Arrays;
import java.util.Collections;

public class DescendingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] objarr={"apple","mango","orange","guava"};
		Arrays.sort(objarr,Collections.reverseOrder());
		System.out.println("Descending order:");
		System.out.println(Arrays.toString(objarr));

	}

}
