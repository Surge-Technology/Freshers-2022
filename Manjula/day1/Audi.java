package day1;
//method overloading
public class Audi {
	int model;
	String name;
	public void display(int model,String name)
	{
		
		System.out.println(model+" "+name);
	
	}
	public void display(String Ab)
	{
		
		System.out.println(name);
	}
	public void display()
	{
		System.out.println("rain");
	}

}
