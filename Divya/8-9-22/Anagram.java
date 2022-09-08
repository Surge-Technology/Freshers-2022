package arraylist.com;

import java.util.Arrays;

public class Anagram {
//private static final String A = null;
//private static final String B = null;
//private static final long[] BChars = null;
//private static final String isAnagram = null;
//private static long[] AChars;

//How to check if two given string is anagram for each other?
// For Example 1. Army-> Mary is anagram   2. Silence->License is anagram
	
	private static final String A = null;
	private static final String B = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="mary";
		String B="sile";
		isAnagramUsingSort(A,B);
	}

private static void isAnagramUsingSort(String a, String b) {
	// TODO Auto-generated method stub
	char[] AChars=A.toLowerCase().toCharArray();
	char[] BChars=B.toUpperCase().toCharArray();
	Arrays.sort(AChars);
	Arrays.sort(BChars);
	boolean isAnagram=Arrays.equals(AChars,BChars);
	System.out.println("anagram sort:"+isAnagram);
	
}

}
