package Interface;

public class InterfaceClass implements Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 obj = new InterfaceClass();
		obj.getName("Stranger Things");
		

	}

	@Override
	public void getName(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	
	}

	
	

}
