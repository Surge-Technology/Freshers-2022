package eightnine;

import java.util.ArrayList;
import java.util.HashMap;


public class EmpDetails {

	public static ArrayList<Integer>empid() {
		
		ArrayList<Integer>emp_id=new ArrayList<>();	 
		
		emp_id.add(177);
		emp_id.add(178);
		emp_id.add(179);
		return emp_id;
	}
	public static ArrayList<String>empname() {
	
		ArrayList<String> emp_name=new ArrayList<String>();
		emp_name.add("rakesh");
		emp_name.add("maanraj");
		emp_name.add("akila");
		return emp_name;
		
	}
	public HashMap<Integer,String> EmpList(ArrayList<Integer>n,ArrayList<String>a) {
		 HashMap<Integer,String> emplist = new HashMap<>();
	 for(int i=0;i<n.size();i++) {
		 emplist.put(n.get(i), a.get(i));
	 }

			return emplist;
		 }


	public static void main(String[] args) {
		EmpDetails obj = new EmpDetails ();
		ArrayList<Integer> EmpId=obj.empid();
		ArrayList<String> EmpName=obj.empname();
		System.out.println(EmpId);
		System.out.println(EmpName);
		HashMap<Integer, String> empList = obj.EmpList(EmpId, EmpName);
		System.out.println(empList);
	}
	
	}

