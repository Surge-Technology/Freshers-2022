package shreyas;

public class SecondHigestNoInArray {
	public static int getSecondHigestNoInArray(int a[],int total) {
		int temp;
	for(int i=0; i<total;i++) {
		for(int j=i;j<total;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	return a[total-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,6,7,8,9};
		System.out.println("Second Largest:"+getSecondHigestNoInArray(a,6));

	}

}
