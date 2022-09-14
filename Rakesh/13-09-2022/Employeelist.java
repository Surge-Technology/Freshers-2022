package sep13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Sep09.EmployeeDetails;

public class Employeelist {
	public List<EmployeeDetails> getmaleEmp() {
		ArrayList<EmployeeDetails> empList = new ArrayList<EmployeeDetails>();
		EmployeeDetails e1 = new EmployeeDetails();
		e1.setemp_id(1);
		e1.setemp_name("Rakesh");
		empList.add(e1);
		EmployeeDetails e2 = new EmployeeDetails();
		e2.setemp_id(2);
		e2.setemp_name("Maanraj");
		empList.add(e2);
		EmployeeDetails e3 = new EmployeeDetails();
		e3.setemp_id(3);
		e3.setemp_name("Sanjay");
		empList.add(e3);
		return empList;
	}

	public List<EmployeeDetails> getfemaleEmp() {
		ArrayList<EmployeeDetails> empList = new ArrayList<EmployeeDetails>();
		EmployeeDetails m1 = new EmployeeDetails();
		m1.setemp_id(4);

		m1.setemp_name("Bala");
		empList.add(m1);

		EmployeeDetails m2 = new EmployeeDetails();
		m2.setemp_id(5);
		m2.setemp_name("Manju");
		empList.add(m2);

		EmployeeDetails m3 = new EmployeeDetails();
		m3.setemp_id(6);
		m3.setemp_name("Divya");
		empList.add(m3);
		return empList;
	}

	public HashMap<Integer, String> getmap() {
		List<EmployeeDetails> maleEmp = getmaleEmp();
		List<EmployeeDetails> femaleEmp = getfemaleEmp();

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		EmployeeDetails sde = new EmployeeDetails();
		for (int i = 0; i < maleEmp.size(); i++) {

			sde = maleEmp.get(i);
			map.put(sde.getempid(), sde.getempname());
		}
		for (int j = 0; j < femaleEmp.size(); j++) {

			sde = femaleEmp.get(j);
			map.put(sde.getempid(), sde.getempname());
		}

		return map;

	}

	public static void main(String[] args) {
		Employeelist s1 = new Employeelist();
		// s1.getmaleEmp();
		System.out.println(s1.getmap());
	}

}
