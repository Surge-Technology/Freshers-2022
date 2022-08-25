package day1;
//prime number
public class Prime {
	public static void main(String[] args)   
	{  
		int ct=0,n=8;  
		for(int i=1;i<=n;i++)
		{  
			if(n%i==0)
			{
			ct++;
			if(ct>2)
			break;
			}
			
		}
		if(ct==2)
		{
			System.out.println(n+"is prime");
		}
		else
		{
			System.out.printf(n+"is not prime");
		}
		
			 
	}  
}
