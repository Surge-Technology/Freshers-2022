package ArraylistPrograms;

public class MutliplyArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2,3,5,6,7};
		int arr2[]= {2,1,3,6,7};
		String result="";
		for(int i=0;i<arr1.length;i++) {
			result+=(Integer.toString(arr1[i]*arr2[i])+" ");
		}
		System.out.println(result);

	}

}
