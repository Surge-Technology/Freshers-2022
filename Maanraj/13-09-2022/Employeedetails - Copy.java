package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sangetha0709.Employeelist;

public class Employeedetails {
	public List<Employeelist> getmaleEmp() {
		ArrayList<Employeelist> empList = new ArrayList<Employeelist>();
		Employeelist e1 = new Employeelist();
		e1.setEmpId(01);
		e1.setEmpName("Maan");
		empList.add(e1);

		Employeelist e2 = new Employeelist();
		e2.setEmpId(02);
		e2.setEmpName("Rakesh");
		empList.add(e2);

		Employeelist e3 = new Employeelist();
		e3.setEmpId(03);
		e3.setEmpName("Madhan");
		empList.add(e3);

		return empList;

	}

	public List<Employeelist> getfemaleEmp() {
		ArrayList<Employeelist> empList = new ArrayList<Employeelist>();
		Employeelist e4 = new Employeelist();
		e4.setEmpId(04);
		e4.setEmpName("Manju");
		empList.add(e4);

		Employeelist e5 = new Employeelist();
		e5.setEmpId(05);
		e5.setEmpName("Divya");
		empList.add(e5);

		Employeelist e6 = new Employeelist();
		e6.setEmpId(06);
		e6.setEmpName("Bala");
		empList.add(e6);

		return empList;

	}

	public HashMap<Integer, String> getmap() {
		List<Employeelist> maleEmp = getmaleEmp();
		List<Employeelist> femaleEmp = getfemaleEmp();

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for (int i = 0; i < maleEmp.size(); i++) {

			Employeelist a1 = maleEmp.get(i);
			map.put(a1.getEmpId(), a1.getEmpName());
		}
		for (int i = 0; i < femaleEmp.size(); i++) {

			Employeelist a2 = femaleEmp.get(i);
			map.put(a2.getEmpId(), a2.getEmpName());
		}

		return map
				;

	}
	public static void main(String[] args) {
		Employeedetails sc=new Employeedetails();
		System.out.print(sc.getmap());
		
		
	}

}
 