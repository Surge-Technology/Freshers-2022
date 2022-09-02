package shreyasAssignment;

public class MargeTwoArrays {

	public static void main(String[] args, int a2) {
		int A[] = { 10, 20, 30, 40, 50 };
		int B[] = { 15, 25, 35, 45, 55 };
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
