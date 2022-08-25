package serviceimpl;


import java.util.Scanner;
import Interface.*;
import Interface.Interface1;
import Interface.Multdiv;

public class calculatorimpl extends Modul implements Interface1, Multdiv{
	
	public static void main(String args[]) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number 1");
		int a=s1.nextInt();
		System.out.println("Enter number 2");
		int b=s1.nextInt();
		s1.close();
		Interface1 obj=new calculatorimpl();
		obj.Addition(a,b);
		obj.Substraction(a, b);
		Multdiv obj1=new calculatorimpl();
		obj1.Multiplication(a, b);
		obj1.Divison(a, b);
		calculatorimpl obj2=new calculatorimpl ();
		obj2.modulus(a, b);
		
		
		
		
		
	}
	
	@Override
	public void modulus(int a, int b) {
		System.out.println("the modulus is:"+(a%b));
		
	}
		
	
	

	@Override
	public void Addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("the addition is:"+ a+b);
	}


	@Override
	public void Substraction(int c, int d) {
		// TODO Auto-generated method stub
		System.out.println("the Substraction is:"+ (c-d));
		
		
	}


	@Override
	public void Multiplication(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("the Multiplication is:"+(num1*num2));
	}


	@Override
	public void Divison(int num3, int num4) {
		// TODO Auto-generated method stub
		System.out.println("the divison is:"+(num3/num4));
	}

}
