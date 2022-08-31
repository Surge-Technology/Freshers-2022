package d5;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {2,45,55,56};
		int B[]= {3,34,77,78};
		int a=A.length;
		int b=B.length;
		int cl=a+b;
		
		int[] c=new int[cl];
		for(int i=0;i<a;i++)
		{
			c[i]=A[i];
		}
		for(int i=0;i<b;i++)
		{
			c[a+i]=B[i];
		}
		for(int i=0;i<cl;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		

	}

}
