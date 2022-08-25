package training;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, first=0,next=1;
		System.out.println("Enter how many numbers to print:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.print("The first " + n + " Fibo numbers are:");
		System.out.println(first + " " + next);
		for (int i =1; i <= n-2; ++i)
		{
			int sum = first+next;
			System.out.print(" " + sum);
			first = next;
			next = sum;
			
		}
		
		
		
		
		

	}

}
