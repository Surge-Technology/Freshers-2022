package exceptionhandling;

public class LcmHcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=32,n2=7,temp,temp1,temp2,hcf,lcm;
		temp1=n1;
		temp2=n2;
		while(temp2!=0)
		{
			temp=temp2;
			temp2=temp1%temp%2;
			temp1=temp;
		}
		hcf=temp1;
		lcm=(n1*n2)/hcf;
		System.out.println("The HCF is: "+hcf);
		System.out.println("The LCM is: "+lcm);

	}

}
