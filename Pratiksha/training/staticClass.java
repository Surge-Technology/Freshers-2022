package training;

import java.util.Scanner;

public class staticClass {
	static String emailExtension = "surgetechinc.in";
	public static void main(String[] args) {
		System.out.println("Employee name :");
		Scanner sc = new Scanner(System.in);
		String empName = sc.next();
		
	System.out.println("Employee email id is :" + empName + "@" + emailExtension);
	}

}
