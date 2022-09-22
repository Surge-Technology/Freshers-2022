package akshay;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String str=sc.nextLine();
		String[] strarr=str.split(" ");
		System.out.println(strarr.length);
	}

	
	}


