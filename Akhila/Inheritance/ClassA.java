package Inheritance;

public class ClassA {
	
	public static void main(String[] args) {
		ClassA obj1=new ClassA();
		ClassA obj2=new ClassB();
		ClassA obj3=new ClassC();
		obj1.display();
		obj2.display();
		obj3.display();
	}
	public void display() {
		System.out.println("hi");
		
	}

}
class ClassB extends ClassA{
	
	@Override
	public void display(){
		System.out.println("inside class B");
	}
}
	class ClassC extends ClassA{
	
	@Override
	public void display(){
		System.out.println("inside class C");
	}
	}

