package task;

import java.util.Scanner;

public class Ball {
	

	public static void main(String[] args) {
		
		
		int size ,diameter;
		String strColour;
		Scanner sc=new Scanner(System.in);
		System.out.println("size of ball:");
		size=sc.nextInt();
		System.out.println("diameter of circle");
		diameter=sc.nextInt();
		System.out.println("colour of circle");
	 	strColour=sc.next();
		if ((size==1)&&(diameter ==25)&&strColour==("white"))
		{
			System.out.println("its a football");
		}
		else
		{
			System.out.println("not football");
		}

		
	}

}
