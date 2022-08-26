package basic;

public class Bike1 {
//	 void Bike1()
//	{
//	System.out.println("Bike is created");
//	}
//
//	public static void main(String args[]){
//	Bike1 b=new Bike1();
//	b.Bike1();
//}
//}
	   int id;  
	    String name;  
	    //creating a parameterized constructor  
	    Bike1 (int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //method to display the values  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	Bike1  s1 = new Bike1 (111,"Karan");  
	    	Bike1  s2 = new Bike1 (222,"Aryan");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  }