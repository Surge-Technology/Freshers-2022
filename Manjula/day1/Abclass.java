package day1;
//abstract class
abstract class Silver 
{
 public abstract void run();
 public void voice()
 {
	 System.out.println("hiii");
 }
}
class a extends Silver
{
	public void sleep()
	{
		System.out.println("qwerty");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("fish");
	}
}
public class Abclass extends a{
	public static void main(String[] args)
	{
		a obj=new Abclass();
		obj.sleep();
		obj.voice(); 
		obj.run();
	
	}
}


