package basic;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		double h;
		double r;
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the r value ");
		r = sc.nextInt();
		System.out.println("Enter the h value ");
		h=sc.nextInt();
		double area = pi * r * r*(h/3);
		System.out.println(area);
	}

}
