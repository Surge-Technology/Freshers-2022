package assess1;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,50,49,51,58,15};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=0;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.println(+arr[i]);
		}
		

	}

}
