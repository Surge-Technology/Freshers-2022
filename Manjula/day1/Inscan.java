package day1;
//scanner
import java.util.Scanner;

public class Inscan {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("travel name");
		String name=s1.nextLine();
		
		System.out.println("timing");
		float timing=s1.nextFloat();
		s1.nextLine();
		
		System.out.println(" number of passenger list");
		int list=s1.nextInt();
		s1.nextLine();
	
		
		System.out.println("space");
		boolean space=s1.nextBoolean();
		s1.nextLine();
		
		System.out.println("Stopping");
		String stop=s1.nextLine();
		
		System.out.println("Bus name....."+name);
		System.out.println("Bus timing :"+timing);
		System.out.println("Space available:"+space);
		System.out.println("Bus stopping..."+stop);
		// TODO Auto-generated method stub

	}

}
