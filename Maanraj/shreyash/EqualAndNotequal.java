package shreyasAssignment;

import java.util.Arrays;

public class EqualAndNotequal {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };

		int b[] = { 10, 20, 30, 40, 50 };

		boolean result = Arrays.equals(a, b);

		if (result == true) {

			System.out.println("Two arrays are equal");
		} else {

			System.out.println("Two arrays are not equal");
		}
	}

}
