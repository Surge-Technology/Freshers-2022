package akshay;

import java.util.HashMap;
import java.util.Map.Entry;

class Employee
{
	HashMap<Integer,String> emp=new HashMap<>();
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class EmployeeDetails 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("bala");
		Employee e2=new Employee();
		e2.setId(4);
		e2.setName("charu");
		Employee e3=new Employee();
		e3.setId(6);
		e3.setName("divya");
		HashMap<Integer,Employee> ab=new HashMap<>();{
		ab.put(177, e1);
		ab.put(178, e2);
		ab.put(179, e3);
		System.out.println(ab);
		for(Entry<Integer,Employee> abc : ab.entrySet())
		{
			Employee l=new Employee();
			l = abc.getValue();
			System.out.println(l.getId()+    " "  +l.getName());
		}
		
		}
		
	}
	
	}
	

