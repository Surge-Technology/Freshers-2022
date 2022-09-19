package akshay;

import java.util.Scanner;

public class RemoveOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		String input=sc.nextLine();
		System.out.println("Enter which character to be remove");
		char ch=sc.next().charAt(0);
		
		char[] input1=input.toCharArray();
		for(int i=0;i<input1.length;i++)
		{
			if(input1[i]==ch)
			{
				input1[i]='\0';
				continue;
			}
			
		}
		System.out.println(input1);

	}

	
}
