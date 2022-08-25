package day1;

public class AssignVar {
	
	// final variable
	final int x=10;
	
	//final method
	final void ab()
	{
		System.out.println("Alphabet");
	}

class Methods extends AssignVar
{
	{
		System.out.println(" final method.... ");
	}
}
	

	public static void main(String[] args) {
		//  final variable
		AssignVar a = new AssignVar();
		//a.x=25;//cannot able to access x because of final variable
		
		a.ab();		
		

	}

}
