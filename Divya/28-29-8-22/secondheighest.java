package Assessment1;
// Write a Java Program to find the second-highest number in an array.
public class secondheighest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		
		System.out.println("secondheighest:"+getsecondheighest(a,6));
	}
	public static  int getsecondheighest(int[]a,int total) {
		 
	int temp;
	for(int i=0;i<total;i++) {
		for(int j=i+1;j<total;j++)
		{
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}	
	return a[total-2];
	}
	 
}
;
