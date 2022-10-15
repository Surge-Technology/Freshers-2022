package map;

import java.util.Arrays;
import java.util.Collections;

public class AscendingDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"apple","mango","orange","Guava"};
				Arrays.sort(str);
		System.out.println("Ascending Order ");
		System.out.println(Arrays.toString(str));

		Arrays.sort(str,Collections.reverseOrder());
		System.out.println("Descending Order ");
		System.out.println(Arrays.toString(str));

}
	
}

