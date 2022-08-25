package training;

public class Array {
	public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	int largestnum=arr[0];
    //System.out.println(arr.length);
    for(int i=0; i<arr.length; i++)
    {
     if (arr[i]>largestnum) {
    	 largestnum=arr[i];
     }
    
    }
    System.out.println(largestnum);
}
}
