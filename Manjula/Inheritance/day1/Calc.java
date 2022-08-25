package day1;

import java.util.Scanner;
import Inheritance.Inheri1;
import Inheritance.Inheri2;
import Inheritance.Mod;

public class Calc extends Mod implements Inheri1, Inheri2 {

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number a: ");
		int a=s1.nextInt();
		System.out.println("Enter number b: ");
		int b=s1.nextInt();
		
		Inheri1 obj=new Calc();
		System.out.println(obj.addition(a,b));
		System.out.println(obj.subtraction(a,b));
		Inheri2 obj1=new Calc();
		System.out.println(obj1.multiplication(a,b));
		System.out.println( obj1.division(a, b));
		Calc c=new Calc();
		c.dis(a,b);
	}

	@Override
	public void dis(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}
