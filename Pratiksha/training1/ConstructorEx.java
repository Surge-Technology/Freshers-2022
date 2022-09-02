package training1;

public class ConstructorEx extends SuperClass{
	
	 ConstructorEx() {
		 System.out.println("Default constructor");
	}
	ConstructorEx(int a){
		System.out.println(a);
	}
	 static void a() {
		System.out.println("In display of static method");
	}
	 @Override
	 void display() {
			System.out.println("I m in child class");
		}
	 
}
