package d5;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,44,2,65,17,50};
		int temp=0;
		for(int i=1;i<=arr.length;i++) {
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second highest number:" +arr[arr.length-2]);

	}

}
