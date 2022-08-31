class Bankoperations
  {
	int acc_no;
	int deposit;
	int withdraw;
public Bankoperations(int acc_no,int deposit, int withdraw);
    {
	this.acc_no=acc_no;
	this.deposit=deposit;
	this.withdraw=withdraw;
	}
void print()
    {
	System.out.println(acc_no);
	System.out.println(deposit);
	System.out.println(withdraw);
	}
class Main
  {
	public static void main(String[] args)
	{
	Bankoperations b= new Bankoperations(1234,3456,5756);
	b.print();
	}
  }
}
