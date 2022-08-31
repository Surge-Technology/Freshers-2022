package training;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		System.out.println("Even numbers are:");
		Scanner sc = new Scanner(System.in);
		int evenNum = sc.nextInt();
		int i=0;
		do {
			System.out.println(i);
			i++;
		}while(i%2==0);
	}

}
