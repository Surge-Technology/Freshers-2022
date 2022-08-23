public class  AbstractDemoExtends extends AbstractDemo
{
  void draw(){
      System.out.println("calling abstract.....");
  }
  
  
 public static void main(String[] args)
	{
	AbstractDemo sc=new AbstractDemoExtends();
	sc.draw();
	sc.display();
	}
}
	