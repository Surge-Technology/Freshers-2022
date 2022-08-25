package Training;

public class Abstract01 extends Shape {
	public static void main(String[] args)
	{
		Abstract01 Ab = new Abstract01();
		Ab.draw();
	    Ab.show();
	}

	@Override
	void draw() {
		System.out.println("Abstract method");
		
	}

}
