package Assessment1;

import java.util.Arrays;

//Java Program to Check if Two Arrays Are Equal or Not
public class equalnotequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {22,34,23};
		int b[]= {22,34,23};
		boolean result=Arrays.equals(a,b);
		if(result==true) {
			System.out.println("two arrays are equal");
		}
		else {
			System.out.println("two arrays are not equal ");
		}

	}

}
