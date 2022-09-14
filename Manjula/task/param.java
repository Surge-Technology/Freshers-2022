package task;
//methods
public class param {
	static void num()
	{
		System.out.println("got it");
	}
	//multiple parameters
	static String  mem(String y) {
		return y;
	}
	static int insint(int x,int y) {
		return(x+y);}
	static double insDouble(double x,double y) {
		return(x+y);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num();
		//mp
		System.out.println("explore");
		int num1=insint(24,5);
		double num2=insDouble(4.3,2.22);
		System.out.println("int: "+num1);
		System.out.println("double: "+num2);
		//
	}
}