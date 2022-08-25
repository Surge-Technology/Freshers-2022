package test1;

public class array {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		int arr[]= {1,2,3,4,5};
		int g = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(i == arr.length-1 ) {
				if(arr[i] > arr[i-1]);
				g = arr[i];
			}
			else if(arr[i]<arr[i+1]) {
				g=arr[i+1];
				
					
		
			}
		}
		System.out.println(g);
		
		
		
			
			
		

	}

}
