package training;

public class ClassA {
	public static void main(String[] args) {
		ClassA obj=new ClassA();
		ClassA obj2=new ClassB();
		ClassA obj3=new ClassC();
		obj.display();
		obj2.display();
		obj3.display();
		
	}
	public void display(){
		System.out.println("I m in class A");
	}

}
class ClassB extends ClassA{
	public void display() {
		System.out.println("I m in class B ");
	}
}
class ClassC extends ClassA{
	public void display() {
		System.out.println("I m in class C ");
	}
}
