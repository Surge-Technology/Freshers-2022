public class Circle extends Shape
{
	
	 void draw(){
		System.out.println("abstract method calling...");
	}
	public static void main(String[] args)
	{
		Shape c1=new Circle();
		c1.draw();
		c1.show();
	}
	}
	