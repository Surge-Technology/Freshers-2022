package day1;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//airthmetic operator
		int a=20,b=2,c;
		c=a+b;
		System.out.println("value of c:" +c);
		
		
		//a+=b;
		System.out.println("changes of a" +a ); 
		
		//inc/dec opertor
		b--;
		System.out.println("Decreament operator:" +b);
		
		//compound assignment
		System.out.println("....COMPOUNT ASSIGNMENTS....");
		byte by=21;
		by+=10;
		short s=9;
		s-=8;
		short s1=50;
		s1>>=2;
		byte by1=7;
		by1^=77;
		System.out.println("byte increament " +by);
		System.out.println("short assigning " +s);
		System.out.println(" right shift " +s1);
		System.out.println("byte OR operator " +by1);
		
		//add 100 number using compound 
		a+=80;
		System.out.println(a);
		
		
		
		

	}

}
