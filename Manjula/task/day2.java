package task;

import java.util.Scanner;

public class day2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		double pi=3.14,area;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter radius of circle");
		r=sc.nextInt();
		area=pi* r * r;
		System.out.println("Enter area of circle "+area);
		
		
		//volume of cone
		int i,h;
		double Pi=3.14,vol;
		Scanner s=new Scanner(System.in);
		System.out.println("enter height");
		h=sc.nextInt();
		System.out.println("enter radius");
		i=sc.nextInt();
		vol=pi*r*r*(h/3);
		System.out.println("the volume of cone"+vol);
	}
}
