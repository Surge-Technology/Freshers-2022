package Assessment1;

import java.util.Scanner;
//Java Program to Find LCM and HC of 2 numbers
public class hcflcm{
	public static void main(String[] args) {
		int num1;
		int num2;
		int temp1,temp2,temp,hcf,lcm;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the 1 st no: " );
			num1=	sc.nextInt();
		System.out.println("enter the 2 nd no: ");
				num2=sc.nextInt();
				sc.close();
		temp1=num1;
		temp2=num2;
		
		while(temp2!=0) {
			temp=temp2;
			temp2=temp1%temp2;
			temp1=temp;
		
		hcf=temp1;
		lcm=(num1*num2)/hcf;
		System.out.println("HCF of input numbers: "+hcf);
	    System.out.println("LCM of input numbers: "+lcm);
	}
	}
}
	