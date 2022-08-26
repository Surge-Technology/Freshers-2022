package Assessment1;

public class modeltest2  extends modeltest3 implements Modeltest1{

	public static void main(String[] args) {
		Modeltest1 obj=new modeltest2();
		System.out.println("sub:"+obj.sub(2, 3));
		System.out.println("add:"+obj.add(2, 3));
		modeltest3 obj1=new modeltest2();

		obj1.division();
		obj1.modulus();
		modeltest4 obj2=new modeltest4();
	    obj2.setA(1);
	    obj2.setB(3);
	    obj1.multiply(obj2.getA(2),obj2.getB(3));
		 
		
	}

	
	

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
		
	}

	

	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("div:" +(2/3));
	}

	@Override
	public void modulus() {
		// TODO Auto-generated method stub
		System.out.println("mod:" +(2%3));
	}




	@Override
	public void multiply(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("mul:" +a*b); 
	}




	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}







	

}
