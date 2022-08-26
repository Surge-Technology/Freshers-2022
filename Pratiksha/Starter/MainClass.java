package Starter;

import java.util.Scanner;

import Interface.Interface1;
import Interface.MultiDiv;

public class MainClass implements Interface1,MultiDiv {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no 1");
		int a=sc.nextInt();
		System.out.println("Enter the no 2");
		int b=sc.nextInt();
		Interface1 obj=new MainClass();
		obj.Addition(a, b);
		obj.Substraction(a, b);
		MultiDiv obj2 = new MainClass();
		obj2.Multiplication(a, b);
		obj2.Division(a, b);
	}
	
	
	@Override
	public void Addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition is:"+(a+b));
	}


	@Override
	public void Substraction(int c, int d) {
		// TODO Auto-generated method stub
		System.out.println("Substraction is:"+(c-d));
	}


	@Override
	public void Multiplication(int e, int f) {
		// TODO Auto-generated method stub
		System.out.println("Multiplication is:"+(e*f));
		
	}


	@Override
	public void Division(int g, int h) {
		// TODO Auto-generated method stub
		System.out.println("Division is:"+(g/h));
	}
	

}
