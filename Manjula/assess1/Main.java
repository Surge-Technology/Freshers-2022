package assess1;

//import java.util.Scanner;

public class Main extends Test implements Inter
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		
		Test i=new Main();
		i.add(14, 5);
		i.sub(4, 6);
		
		Inter i1=new Main();
		i1.multi(4, 4);
		i1.div(4,6);
		Encap en=new Encap();
		en.setA(2);
		en.setB(5);
		i.mod(en.getA(2),en.getB(5));
		
		
		

	}

	@Override
	public void multi(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition of 2 numbers: "+(4*4));
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Div of 2numbers: "+(4/6));
	}

	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition of two numbers: "+(14+5));
	}

	@Override
	void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Sub of 2 numbers: "+(4-6));
	}

	@Override
	void mod(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Modulus: "+(a+b));
		
	}

	
	

}
