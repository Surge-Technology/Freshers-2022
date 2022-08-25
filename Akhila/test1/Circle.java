package test1;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		double radius;
		double pi=3.147;
		double height;
		double volume;
		System.out.println("Enter radius");
		radius=sc.nextDouble();
		System.out.println("Enter height");
		height=sc.nextDouble();
		
		volume=pi*radius*radius*(height/3);
		System.out.println("volume of cone :"+ volume);

	}

}
