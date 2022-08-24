package Inheritance;

import java.util.Scanner;

import day1.Calc;

public class Calcu extends Mod implements Inheri1, Inheri2 {

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
		Inheri1 c=new Calcu();
		System.out.println("add: "+c.addition(20, 10));
		System.out.println("sub: "+c.subtraction(20, 10));
		
		Inheri2 c1=new Calcu();
		System.out.println("mul: "+c1.multiplication(20,10));
		System.out.println("div: "+c1.division(20, 10));
		
       Calcu modulous=new Calcu();
        modulous.dis(10,20);
	}

	@Override
	public void dis(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("mod: "+(a%b));
		
	}

}
