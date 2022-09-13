package eve;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="license";
		String str2="silence";
		isAnagaramUsingSort(str1,str2);
		

	}

	private static void isAnagaramUsingSort(String str1, String str2) {
		// TODO Auto-generated method stub
		char[] str1char=str1.toLowerCase().toCharArray();
		char[] str2char=str2.toLowerCase().toCharArray();
		Arrays.sort(str1char);
		Arrays.sort(str2char);
		boolean isAnagaram=Arrays.equals(str1char,str2char);
		System.out.println("Anagaram using sort "+isAnagaram);
		}

}
