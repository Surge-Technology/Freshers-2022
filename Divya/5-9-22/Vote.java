package arraylist.com;

//Write a java program to enter age . If age is 18 or greater than 18 than print you are eleigible for votting otherwise NumberFormateException.

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		age=sc.nextInt();
		
		try {
			if(age>=18) {
				System.out.println("you are eligible");
			}
			age=Integer.parseInt("2t");
		}
			
			catch(NumberFormatException e) {
				System.out.println(e);
				System.out.println("number format exception"+age);
				
			}
			
	}	
}