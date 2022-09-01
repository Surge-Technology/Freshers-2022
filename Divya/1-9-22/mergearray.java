package Assessment1;

import java.util.Arrays;

// Java Program to Merge Two Arrays

public class mergearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstarray= {1,2,3,4,5};
		int[] secondarray= {6,7,8,9,0};
		int a=firstarray.length;
		int b=secondarray.length;
		int[]result=new int[a+b];
		System.arraycopy(firstarray, 0, result, 0, a);
		System.arraycopy(secondarray, 0, result, a, b);
		System.out.println(Arrays.toString(result));
	}

}
