class Dog  
{

	void show()
	{
		System.out.println("hello");
	}
	static void dis()
	{
		System.out.println("123");
	}
}
public class Tiger
{
	public static void main(String[] args)
	{
		Dog obj=new Dog();
		obj.show();
		Dog.dis();
	}
}
	

		