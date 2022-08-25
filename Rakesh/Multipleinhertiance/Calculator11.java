package multilevelInhertiance;

import java.util.Scanner;

public class Calculator11 extends Calculatoroverride {
	public static void main(String[] args) {
		double a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number:");
		a = scanner.nextDouble();
		System.out.print("Enter second number:");
		b= scanner.nextDouble();

		System.out.print("Enter an operator  ");
		char operator = scanner.next().charAt(0);

		scanner.close();
		//double output;
		Calculator obj =new Calculatoroverride();
		switch (operator) {
		case '+':
			System.out.println( obj.Add(a,b));
			break;

		case '-':
			System.out.println(obj.sub(a, b));
			break;

		case '*':
			System.out.println(obj.mul(a, b));
			break;

		case '/':
			System.out.println(obj.div(a, b));
			break;

		default:
			System.out.printf("You have entered wrong operator");
			return;
		}

		System.out.println(a+ " " + operator + " " + b + ": " );
	}
}
	

