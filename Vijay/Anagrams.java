package Surge;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		String str1 = "silent";
		String str2 = "listen";

		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();

		Arrays.sort(array1);
		Arrays.sort(array2);

		if (Arrays.equals(array1, array2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}
}
