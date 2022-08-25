package training;

public class Circle extends Shhape {
	@Override
	void draw() {
		System.out.println("Abstract Method is Calling.........");
	}
	public static void main(String[] args) {
         Shhape c1=new Circle();
         Shhape c2=new Circle();
         c1.draw();
         c2.show();
	}
}
