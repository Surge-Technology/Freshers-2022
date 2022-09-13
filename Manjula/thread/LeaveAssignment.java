package thread;

public class LeaveAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,row=5;
		for(i=1;i<=row;i++)
		{
			for(j=i;j<row;j++)
			{
				System.out.println(" ");
			}
			for(k=1;k<=(2*i-1);k++)
			{
				if(k==1||i==row||k==(2*i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("");
		}

	}
	
//	int[] left_array = {1, 3, -5, 4};
//	   int[] right_array = {1, 4, -5, -2};
//	   System.out.println("\nArray1: "+Arrays.toString(left_array));  
//	   System.out.println("\nArray2: "+Arrays.toString(right_array)); 
//    for (int i = 0; i < left_array.length; i++) {
//				int num1 = left_array[i];
//				int num2 = right_array[i];
//				result += Integer.toString(num1 * num2) + " "; 
//			}
//		System.out.println("\nResult: "+result);  

}
