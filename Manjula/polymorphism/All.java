package polymorphism;

public class All extends Sub {
	@Override
	public void show()
	{
		System.out.println("Must sign the register ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub a1= new All();
		a1.show();
		a1.dis();
	}

}
