package day1;
import java.util.Scanner;

public class email {
	static String emailExtension = "surgetechinc.in";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee Name: ");
		Scanner sc= new Scanner(System.in);
		String empName = sc.next();
		System.out.println("Employee Email id : "+empName+"@"+emailExtension);
	}

}
