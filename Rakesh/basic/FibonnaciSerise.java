package basic;

public class FibonnaciSerise 
{
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		System.out.print(a+ " "+b);
		for(int i=1;i<=8;i++)
		{
			int ans=a+b;
			System.out.print(" "+ans+" ");
			a=b;
			b=ans;	
		}
	}
}