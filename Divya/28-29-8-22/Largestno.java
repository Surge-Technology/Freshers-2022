package Assessment1;
//Java Program to find Largest Among Numbers
public class Largestno {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		System.out.println("largest:"+getLargestno(a,6));
	}

	public static int getLargestno(int[] a,int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-1];
	}



}
