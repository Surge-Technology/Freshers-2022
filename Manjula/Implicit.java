public class Implicit 
{
	public static void main(String[] args)
	{
		byte i=40;
		int j=i;
		short k=j;
		long l=k;
		float f=l;
		double d=f;
		System.out.println("bytes :",+i);
	    System.out.println("int :",+i);
		System.out.println("Short :",+i);
		System.out.println("Long :",+i);
	    System.out.println("float :",+i);
		System.out.println("double :",+i);
	}
}