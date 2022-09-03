package shreyashTask;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		int a, b, hcf, lcm;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the Two Numbers: ");
		a = s.nextInt();
		b = s.nextInt();

		if (a > b)
			lcm = a;
		else
			lcm = b;

		while (true) {
			if ((lcm % a == 0) && (lcm % b == 0))
				break;
			else
				lcm++;
		}

		System.out.println("\nLCM(" + a + ", " + b + ") = " + lcm);
	}
}
