package Training;

import java.util.*;

public class ScannerClass {

	public static void main(String[] args) {
		double pi = 3.14;
		double r;
        double h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the r value");
		r = sc.nextInt();
		System.out.println("Enter the h value");
		h = sc.nextInt();
		sc.close();
		double area = pi * r * r*(h/3);
		System.out.println(area);

	}

}
