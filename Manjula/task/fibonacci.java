package task;

import java.util.Scanner;

public class fibonacci {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, n1=0,      n2=1,      n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no: ");
		n=sc.nextInt();
		System.out.println("fib series"+n1+" "+n2);
		for(int i=1;i<=n-2;i++)
		{
			n3=n2+n1;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
		}
		
		
		
		
		
	}

}
