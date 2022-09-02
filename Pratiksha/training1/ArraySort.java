package training1;

public class ArraySort {
	public static void main(String[] args) {
		int temp=0;
		int arr[]= {5,50,49,51,58,15,1};
		for (int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length ; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
		
	}

}
