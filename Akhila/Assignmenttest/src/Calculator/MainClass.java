package Calculator;



public class MainClass extends Divmod implements Interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass obj1=new MainClass();
		obj1.modulus(11, 2);
		
        Interface obj2=new MainClass ();
        obj2.Substraction(10,2);
        obj2.Division(20, 2);
        obj2.Multiply(2, 3);
        Encapsulation obj3=new Encapsulation();
        obj3.seta(1);

        obj3.setb(2);
        obj1.add(obj3.geta(), obj3.getb());

       }

	@Override
	public void modulus(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a%b);
	}

	@Override
	public void Substraction(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}

	@Override
	public void Division(int c, int d) {
		// TODO Auto-generated method stub
		System.out.println(c/d);
		
	}

	@Override
	public void add(int c, int d) {
		// TODO Auto-generated method stub
		System.out.println(c+d);
		
	}

	@Override
	public void Multiply(int e, int f) {
		// TODO Auto-generated method stub
		System.out.println(e*f);
	}

}
