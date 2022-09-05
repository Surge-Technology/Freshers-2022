package collection;

public class MultiplicationOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,6,8,3};
		int b[]= {1,0,4,5,8};
		System.out.print("The First Array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			System.out.println();
		}
		System.out.print("The Second array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]);
			System.out.println();
		}
		System.out.print("Multiplication of two Arrays:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]*b[i]+", ");
			System.out.println();
		}
		

	}

}
