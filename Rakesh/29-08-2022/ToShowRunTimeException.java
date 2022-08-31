package exceptionHandling;

public class ToShowRunTimeException {

	public static void main(String[] args) throws Exception{
		int a =8;
		int b=0;
		try {
			int c=a/b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("last list");	
	}

}
