package task;

class Bank {
	int accNo;
	static String IFSC;
	void create(int a,String b)
	{
		accNo=a;
		IFSC=b;
	}
	void display()
	{
		System.out.println(accNo+"  "+IFSC);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		b1.create(44748898,"IND567899");
		b1.display();
		Bank b2=new Bank();
		b2.create(56897321,"IND567899");
		b2.display();
				

	}

}
