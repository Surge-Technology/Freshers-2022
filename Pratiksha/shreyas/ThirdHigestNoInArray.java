package shreyas;

public class ThirdHigestNoInArray {
	public static int getThirdHigestNoInArray(int a[],int total){
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-3];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {21,34,54,23,65,66};
		System.out.println("Third largest no:"+getThirdHigestNoInArray(a,6));

	}

}
