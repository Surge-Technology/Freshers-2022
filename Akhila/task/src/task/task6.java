package task;

public class task6 {
	public static void main (String args[]) {
	int temp=0;
	int size;
	int[] arr= {10,25,20,35,30};
	size=arr.length;
	for(int i=0;i<=size;i++) {
		for(int j=i;j<size;j++) {
			if(arr[i]>arr[j]) 
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
	
}

	System.out.println(" Third largest number is:"+arr[size-3]);

}


}
