package Sangita;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		 String source="triangle";
	     String target="integral";
	     
	     IsanagramUsingSort(source,target);
	      
	}
	 private static void IsanagramUsingSort(String source,String target) {
		char[] sourceChars = source.toLowerCase().toCharArray();
		char[] targetChars = target.toLowerCase().toCharArray();
		Arrays.sort(sourceChars);//a ,e,g,i,l,n,r,t
		Arrays.sort(targetChars);//a ,e,g,i,l,n,r,t
		boolean Isanagram=Arrays.equals(sourceChars, targetChars);
		System.out.println("Anangram using sort:"+Isanagram);
	}

}
