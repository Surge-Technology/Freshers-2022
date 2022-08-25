package day1;

public class Circle extends Shape
{

	public static void main(String[] args) {
		 
		Shape c1=new Circle();
		c1.draw();
		c1.show();

	}

	@Override
	void draw() {
	System.out.println("Abstract Method Calling........");
		
	}

}
