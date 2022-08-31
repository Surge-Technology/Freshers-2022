package d5;

public class StringToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "10.5";
		String s2= "30.8";
		//string to float
		float f=Float.parseFloat(s2);	
		System.out.println(f+4);
		
		//string to double
		double i1=Double.parseDouble(s1);
		System.out.println(i1-2.8);
		}
}