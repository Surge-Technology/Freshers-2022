package sept05;

import java.util.Scanner;

public class Voting {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int age;
		    
		    
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your age=");
	        age = sc.nextInt();
	        try {
	        	if(age>=18) {
	        		System.out.println("You are eligible");
	        	}
	        	age = Integer.parseInt("22a");
		        System.out.println(age);
	        }
	        catch(NumberFormatException e){
	        	System.out.println(e);
	        	System.out.println("Number format Exception");
	        }
		    
		

	}

}
