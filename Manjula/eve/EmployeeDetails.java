package eve;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDetails
{
	public Map emp1()
	{
		HashMap<Integer,String>empl=new HashMap<Integer,String>();
		empl.put(101, "anitha");
		empl.put(102, "pooja");
	    for(Map.Entry m : empl.entrySet())
	    {
	    	System.out.println(m.getKey()+" "+m.getValue());
	    }
		return empl;
	}

	static List<Employee>emp(List<Employee>List)
	{
		Employee e1=new Employee();
		e1.setemp_id(101);
		e1.setemp_name("Sindhu");
		System.out.println(e1.getemp_id());
		System.out.println(e1.emp_name);
		
		Employee e2=new Employee();
		e2.setemp_id(102);
		e2.setemp_name("Parkavi");
		System.out.println(e2.getemp_id());
		System.out.println(e2.getemp_name());
		
		Employee e3=new Employee();
		e3.setemp_id(103);
		e3.setemp_name("pavi");
		System.out.println(e3.getemp_id());
		System.out.println(e3.getemp_name());
		return null;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emp(null);
	}

	

}
