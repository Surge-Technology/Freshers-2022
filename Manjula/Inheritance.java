class Bird
{
	public void show()
	{
		System.out.println("quack");
	}
}

public class Inheritance extends Bird
{ 
	public void feek()
	{
		System.out.println("callingg...");
	}
	public static void main(String[] args)
	{
		Inheritance b=new Inheritance();
		b.show();
		b.feek();
	}
}
