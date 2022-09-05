package arraylist.com;

import java.util.Scanner;

  //count vowels in given string=>welcome to java program.
//find non-repeating character.
//check given string palindrome or not?
 

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to java program";
		int vowels=0;
		String rev="";

		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='u')
			{
				++vowels;
			}
		}
		System.out.println("vowels are: "+vowels);
		if(rev.equals(str)) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("not a palindrome");	
	}
	}
}
