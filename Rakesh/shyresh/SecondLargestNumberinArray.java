package shreyashTask;

import java.util.Arrays;

public class SecondLargestNumberinArray {

	public static int getSecondLargest(int[] a, int total) {
	
		Arrays.sort(a);
		return a[total - 2];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		
		System.out.println(getSecondLargest(a, 6));

	}
}
