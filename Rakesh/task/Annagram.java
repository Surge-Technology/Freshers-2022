package sangethatask.com;

import java.util.Arrays;

public class Annagram {
	public static void main(String[] args) {

		String str1 = "Army";
		String str2 = "Mary";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() != str2.length()) {
			System.out.println(" not anagram");
		} else {
			char[] String1 = str1.toCharArray();
			char[] String2 = str1.toCharArray();
			Arrays.sort(String1);
			Arrays.sort(String2);
			if (Arrays.equals(String1, String2) == true) {
				System.out.println("both are anagram");
			} else {
				System.out.println("not a anagram");
			}

		}

	}
}
