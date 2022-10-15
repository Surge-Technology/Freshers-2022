package task;

public class Driver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.setModel(2345);
		c1.setName("BMW");
		updateObject(c1);
		System.out.println(c1.getModel()+""+c1.getName());
	}
	static void updateObject(Car c2)

	{
		System.out.println(c2.getModel()+""+c2.getName());
		c2.setModel(456);
		c2.setName("Benz");
		System.out.println(c2);
	}
}
