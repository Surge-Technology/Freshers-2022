//LCM and HCF of two numbers


package task;

public class task9 {
	public static void main (String args[]) {
		int temp1, temp2, num1=12, num2=14, temp, hcf, lcm;
	      temp1 = num1;
	      temp2 = num2;

	      while(temp2 != 0){
	         temp = temp2;
	         temp2 = temp1%temp2;
	         temp1 = temp;
	      }

	      hcf = temp1;
	      lcm = (num1*num2)/hcf;

	      System.out.println("HCF of input numbers: "+hcf);
	      System.out.println("LCM of input numbers: "+lcm);
	}
}
