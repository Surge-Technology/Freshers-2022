package Interface;

import java.util.Scanner;

public class Calculatormain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int no;
		System.out.print("Enter first number:");
		 double a = sc.nextDouble();
	        System.out.print("Enter second number:");
	     double b = sc.nextDouble();
	      System.out.println("Enter number 1=Add,2=Sub,3=multiply,4=Div");
	      no=sc.nextInt();
	      CalculatorInterface obj=new Calculator();
	      
	      switch (no) {
	      case 1:
	      {
	    	  System.out.println(obj.Addition(a, b));
	    	  break;
	      }
	      case 2:
	      {
	    	  System.out.println(obj.Substraction(a, b));
	    	  break;
	      }
	      case 3:
	      {
	    	  System.out.println(obj.Multiplication(a, b));
	    	  break;
	      }
	      case 4:
	      {
	    	  System.out.println(obj.Division(a, b));
	    	  break;
	      }
	      default :
	      {
	    	  System.out.println("Invalid Input");
	      }
	      }

	}

	
}
