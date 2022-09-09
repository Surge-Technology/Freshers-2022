package ExceptionHandlingPrograms;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int d=100/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Custom Exception Program");
	}

}
