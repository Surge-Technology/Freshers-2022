package com.Surge.Sep1;

public class PracticeSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1; i <= n-1; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= n-i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}