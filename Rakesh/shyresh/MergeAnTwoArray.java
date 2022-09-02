package shreyashTask;

public class MergeAnTwoArray {

	public static void main(String[] args, int a2) {
		int A[] = {45,55,67,78, 68};
		int B[] = { 45,56,89,89 ,77};
		int a = A.length;
		int b = B.length;
		int cl = a + b;
		int[] c = new int[cl];
		for (int i = 0; i < a; i++) {
			c[i] = A[i];
		}
		for (int i = 0; i < b; i++) {
			c[a + i] = B[i];
		}
		for (int i = 0; i < cl; i++) {
			System.out.print(c[i] + " ");
		}

	}
}
