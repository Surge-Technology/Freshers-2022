package Interface;

public class Sample2 implements Sample1{

	public static void main(String[] args) {
		Sample1 obj1=new Sample2();
		obj1.getName("Akhila");
		
		// TODO Auto-generated method stub

	}

	@Override
	public void getName(String Name) {
		// TODO Auto-generated method stub
		System.out.println(Name);
	}

}
