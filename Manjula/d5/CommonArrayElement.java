package d5;

public class CommonArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {5,25,15,21,26,9,13};
		int arr2[]= {21,5,9,11,25,26,31};
		System.out.println("The commmon elements are:");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				System.out.println( arr1[i] );
			}
		}

	}

}
