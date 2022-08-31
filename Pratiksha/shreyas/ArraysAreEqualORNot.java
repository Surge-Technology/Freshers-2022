package shreyas;

public class ArraysAreEqualORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = new int[] {11,23,34,56,78};   
		int[] a2 = new int[] {11,23,34,56,78};   
		//because ref of a1 and a2 are diff though size n ele are same
		if (a1 == a2)   
		System.out.println("Arrays are equal.");   
		else  
		System.out.println("Arrays are not equal.");   

	}

}
