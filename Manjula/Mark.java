package day1;

public class Mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] []= {{"priya"},{"sai"},{"kavi"}};

		int[][] arr= {{457,899,90},{478,876,89},{83,789,98}};
		Mark m=new Mark();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(m.a[0][1]);
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}
