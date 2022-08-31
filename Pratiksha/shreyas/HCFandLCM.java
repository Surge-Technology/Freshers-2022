package shreyas;
import java.util.Scanner;

public class HCFandLCM {
	   public static void main(String args[]){
		   
	      int t1, t2, n1, n2, temp, hcf, lcm;
	      Scanner scanner = new Scanner(System.in);

	      System.out.print("Enter First Number: ");
	      n1 = scanner.nextInt();
	      System.out.print("Enter Second Number: ");
	      n2 = scanner.nextInt();
	      scanner.close();

	      t1 = n1;
	      t2 = n2;

	      while(t2 != 0){
	         temp = t2;
	         t2 = t1%t2;
	         t1 = temp;
	      }

	      hcf = t1;
	      lcm = (n1*n2)/hcf;

	      System.out.println("HCF of input numbers: "+hcf);
	      System.out.println("LCM of input numbers: "+lcm);
	   }
	}


