package exceptionhandling;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {3,42,54,15,68};
		try
		{
			System.out.println(n[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("last line");
		}

	}

}
