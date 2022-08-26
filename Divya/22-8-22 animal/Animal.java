abstract class Animal
{
	public abstract void animalsound();
	public void sleep()
	{
	System.out.println("sleepy");
	}
}
class deer extends Animal
{
	public void animalsound()
	{
	System.out.println("grass eat");
	}	
}	

class main
  {
	public static void main(String[] args){
	deer a = new deer();
	a.animalsound();
	a.sleep();
  }
}




	