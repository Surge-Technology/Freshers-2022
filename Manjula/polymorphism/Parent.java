package polymorphism;

public class Parent {

	public int num(int num1,int num2)
	{
		num1=num1+num2;
		return num1;
	}
	private String num(String n1,String n2)
	{
		return n1+n2;
		
	}
	public static void main(String[] args) {
		Parent obj=new Parent();
		System.out.println(obj.num(34, 22));
		System.out.println(obj.num("santhivika", "ram"));
	
	}

}
