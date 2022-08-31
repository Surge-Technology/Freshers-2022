package d5;

import java.util.Arrays;

public class ArrayEqualAreNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {3,6,8,9,4};
		int[] arr2= {3,6,8,9,4};
		//true false boolean
		boolean res=Arrays.equals(arr1,arr2);
		if(res==true)
		{
			System.out.println("Arrays are equal");
		}
		else 
		{
			System.out.println("Arrays are not equal");
		}

	}

}
