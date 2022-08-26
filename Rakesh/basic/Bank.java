package basic;

public class Bank 
{
		int accno;
		static String IFSC;

void accept(int a,String b) 
{
		accno=a;
		IFSC=b;
}
void display() 
{
		System.out.println(accno+" "+IFSC);
	}

static void fun() {
	//System.out.println(accno);
	System.out.println(IFSC);
	}
}