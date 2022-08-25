abstract class Bike
  {
   abstract void run();
  }
class Yamaha extends Bike
 {
  
  void run()
  {
   System.out.println("bike goes fastly");
  }
public static void main(String[] args)
{
  Bike A =new Yamaha();
  A.run();
}
}

	
