package exceptionhandling;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try
		{
			
			System.out.println(str.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("rest of code");
		}

	}

}
