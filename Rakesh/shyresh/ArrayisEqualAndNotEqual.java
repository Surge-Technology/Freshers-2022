package shreyashTask;

import java.util.Arrays;

public class ArrayisEqualAndNotEqual {

	public static void main(String[] args) {

		int a[] = { 23,34,33,23};

		int b[] = { 23,43,5,3};

		boolean result = Arrays.equals(a, b);

		if (result == true) {

			System.out.println("Two arrays are equal");
		} else {

			System.out.println("Two arrays are not equal");
		}
	}
}
