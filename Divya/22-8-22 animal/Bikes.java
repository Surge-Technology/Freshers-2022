abstract class Bikes{  
  abstract void run();  
}  
class Honda4 extends Bikes{  
void run(){System.out.println("running safely");}  
public static void main(String args[]){  
 Bikes obj = new Honda4();  
 obj.run();  
}  
}  