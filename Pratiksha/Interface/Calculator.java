package Interface;

import java.util.Scanner;

public class Calculator extends Module implements Interface1,MultiDiv  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		Calculator obj=new Calculator();
		obj.modulus(a, b);
		Interface1 obj1 = new Calculator();
		obj1.Addition(a, b);
		obj1.Substraction(a, b);
		MultiDiv obj2 = new Calculator();
		obj2.Multiplication(a, b);
		obj2.Division(a, b);

	

}

	@Override
	public void modulus(int a,int b) {
		// TODO Auto-generated method stub
		System.out.println("Modlus is:"+(a%b));
		
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

	@Override
	public void Addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition is:"+(a+b));
	}

	@Override
	public void Substraction(int c, int d) {
		// TODO Auto-generated method stub
		System.out.println("Substractiob is:"+(c-d));
	}
}