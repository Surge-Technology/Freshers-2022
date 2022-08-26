package practice;

public class Constructor extends ConstructorSuper{
	void fun() {
		System.out.println("maan");
	}
	
	Constructor(){
		System.out.println("default");
		//Constructor c1 = new Constructor();
		super.funn();
	}
	Constructor(int a,int b){
		System.out.println(a+b);
		
	}

}
