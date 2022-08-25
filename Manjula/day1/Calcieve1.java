package day1;

import java.util.Scanner;

public class Calcieve1 implements Calcieve{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		double n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A:");
		n1=sc.nextDouble();
		System.out.println("Enter B");
		n2=sc.nextDouble();
		System.out.println(" 1.A+B\n 2.A-B\n 3.A*B\n 4.A/B");
		char exp = sc.next().charAt(0);
		sc.close();
		double result;
		
		switch (exp)
		{
		case 1:
			result=n1+n2;
			break;
		case 2:
			result=n1-n2;
			break;
		case 3:
			result=n1*n2;
			break;
		case 4:
			result=n1/n2;
			break;
		default:
			System.out.println("Not found");
			return;
		
		}
		System.out.println(n1+ " " +exp+" "+n2+":"+result);
		
	}

	private static void getInput(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(double a, double b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mul(double a, double b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double div(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mod(double a, double b) {
		// TODO Auto-generated method stub
		
	}

}
