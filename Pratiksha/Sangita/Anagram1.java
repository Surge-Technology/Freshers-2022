package Sangita;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "Peek";
		String target = "keep";
		
		isanagram(source,target);

	}
	private static void isanagram(String source,String target) {
		char[] objscr = source.toLowerCase().toCharArray();
		char[] objtar = target.toLowerCase().toCharArray();
		Arrays.sort(objscr);
		Arrays.sort(objtar);
		boolean isanagram=Arrays.equals(objscr, objtar);
		System.out.println("Anagram using sort:"+isanagram);
		
		
	}

}
