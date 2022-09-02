package shreyashTask;

import java.util.Scanner;

public class Hcf {
	public static void main(String[] args) {
		int hcf, a, b;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the Two Numbers: ");
		a = s.nextInt();
		b = s.nextInt();

		for (hcf = (a < b) ? a : b; true; hcf--) {
			if ((a % hcf == 0) && (b % hcf == 0))
				break;
		}

		System.out.println("\nHCF(" + a + ", " + b + ") = " + hcf);
	}
}
