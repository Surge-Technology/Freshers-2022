package d5;

import java.util.Scanner;

public class StringSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String str=sc.nextLine();
		str=str.replaceAll(" ","");
		System.out.println("after removing white space: "+str);
		
		
		
		
		

	}

}
