class Employee
{
	float salary=18500;
}
public class Programmer extends Employee
{
	int bonus=900;
	public static void main(String[] args)
	{
	Programmer p=new Programmer();
	System.out.println(p.salary);
	System.out.println(p.bonus);
	}
}