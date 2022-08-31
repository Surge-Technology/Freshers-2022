package Calculator;

public class MainCal extends AbstractCal implements InterfaceCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		InterfaceCal obj = new MainCal();
		obj.addition(5, 5);
		obj.substraction(10, 5);
		AbstractCal obj1 = new MainCal();
		obj1.division(20, 10);
		obj1.multiplication(10, 20);
		EncapsulationCal obj2=new EncapsulationCal();
		obj2.seta(1);
		obj2.setb(3);
		obj1.mod(obj2.geta(1),obj2.getb(3));
		
	}

	@Override
	public void multiplication(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Multiplication is:"+(10*20));
	}

	@Override
	public void division(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Division is:"+(20/10));
	}

	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition is:"+(5+5));
	}

	@Override
	public void substraction(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Substraction is:"+(10-5));
	}

	@Override
	public void mod(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Modulus is:"+(a%b));
	}

	

}
