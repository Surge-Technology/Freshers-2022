package Interface;

import java.util.Scanner;

public class InterfaceCalculatorMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		double a = sc.nextDouble();
		System.out.println("Enter b:");
		double b = sc.nextDouble();
		System.out.println("Enter number from 1 to 4:");
		number=sc.nextInt();
		InterfaceCalculator iobj = new InterfaceClassCalculator();
		
		switch (number)
		{
		case 1:
			System.out.println(iobj.Addition(a, b));
			break;
		case 2:
			System.out.println(iobj.Substraction(a, b));
			break;
		case 3:
			System.out.println(iobj.Multiplication(a, b));
			break;
		case 4:
			System.out.println(iobj.Division(a, b));
			break;
		default :
	         System.out.println("Invalid input");
		}

	}

	

}
