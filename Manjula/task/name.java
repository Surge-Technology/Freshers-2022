package task;

public class name
{
	static void pot() {
		System.out.println("water full");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,10,15};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			//check the array list
			if(a[i]<20) {
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		//length of array 
		System.out.println(a.length);
		// method calling
		pot();
			
		
		

	}

}
