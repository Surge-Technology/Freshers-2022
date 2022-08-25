package basic;

public class Recursion {

	
	
	
	void show(int i)
	{
		show(--i);
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Recursion r=new Recursion();
		r.show(5);
		
		
	}

}
