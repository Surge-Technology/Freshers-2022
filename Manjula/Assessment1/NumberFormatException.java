package renuka;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=16;
		
		try {
			
			
			if( age>=18)
			{
				
				
				System.out.println("Eligible for voting");
				
			}
			else {
			age=Integer.parseInt("2w");
			System.out.println(age);
		}
		}
		catch(Exception e)
		{
		
			System.out.println("Exception:"+e);
		}
		finally
		
		{
			System.out.println("rest of code");
		}

	}

}
