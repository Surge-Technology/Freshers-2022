class Bird
{
//polymorphism
	public void voice()
	{
		System.out.println("TUrr");
	}
}
class Duck extends Bird{
	public void voice()
	{
		System.out.println("quack");
	}
class Main()
{
	public static void println(String[] args)
	{
	Bird mybird=new Bird();
	Duck myduck=new Duck();
	mybird.voice();
	myduck.voice();
	}
}