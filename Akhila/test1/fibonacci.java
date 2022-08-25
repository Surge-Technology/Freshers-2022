package test1;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b=0;
		int c=1;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		 System.out.print("The first " + a + " Fibonacci numbers are: ");
         System.out.print(b + " " + c);
         for(int i=1;i<=a-2;++i)
         {
        	 int sum=b+c;
        	 b=c;
        	 c=sum;
        	 System.out.println(" "+sum);
        	 
         }
		

	}

}
