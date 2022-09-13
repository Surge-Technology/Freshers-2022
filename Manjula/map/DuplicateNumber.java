package map;

import java.util.HashMap;

public class DuplicateNumber {
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Boolean> mp = new HashMap<>();

		 int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2,9 };
		 int n = arr.length;
		
		for (int i = 0; i < n; i++)
	    {

		System.out.println(arr[i]);
        if (mp.get(arr[i]) == null)
        System.out.print(arr[i] + " ");
     	 mp.put(arr[i], true);
        }
}

	

}
