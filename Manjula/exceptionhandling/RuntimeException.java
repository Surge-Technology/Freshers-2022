package exceptionhandling;

public class RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=67,b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}	
		finally
		{
			System.out.println("rest of code");
		}
			
		
		
	
	
	}

}
