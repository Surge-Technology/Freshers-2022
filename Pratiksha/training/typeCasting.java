package training;

public class typeCasting {
	public static void main(String[] args) {
		int num=10;
		double num1=99.99;
		System.out.println("The integer value is:" + num);
		System.out.println("The double value is:" + num1);
	
double data = num;//implicit type casting
int data1 = (int)num1;//Explicit type casting 
System.out.println("The double value is:" + data);
System.out.println("The integer value is:" + data1);
		
		
		
}
}