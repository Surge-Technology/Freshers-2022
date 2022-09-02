package Training;

public class FibonacciDemo {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b);
		for (int i = 0; i <= 9; ++i) {
			int ans = a + b;
			System.out.print(" " + ans + " ");
			a = b;
			b = ans;
		}

	}

}
