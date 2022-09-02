package shreyasAssignment;
import java.util.Arrays;

public class SecondLargestNumberInArray {

	public static int getSecondLargest(int[] a, int total) {
		Arrays.sort(a);
		return a[total - 2];
	}

	public static void main(String args[]) {
		int a[] = {5,9,8,3,4,7,6 };
		System.out.println("Second Largest: " + getSecondLargest(a, 7));
	

	}

}
