package akshay;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String rev="";
		String str=sc.nextLine();
		//boolean b1=Boolean.valueOf(str);
		int length=str.length();
		for(int i=(length-1);i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		if(str.equals(rev))
		{
			System.out.println(str+"is a palindrome="+Boolean.parseBoolean("True"));
		}
		else
		{
			System.out.println(str+" is not a palindrome="+Boolean.parseBoolean("False"));
		}
		

	}

}
