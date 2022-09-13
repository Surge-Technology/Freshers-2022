package Sep09;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import basic.Employee;

public class EmployeeDetails1 {
	public List<EmployeeDetails> getemplist(List<EmployeeDetails> List){
	EmployeeDetails e1= new EmployeeDetails();
    e1.setemp_id(1);
    e1.setemp_name("Rakesh");
    System.out.println(e1.getemp_id());
    System.out.println(e1.getemp_name());
    EmployeeDetails e2= new EmployeeDetails();
    e2.setemp_id(2);
    e2.setemp_name("ananad");
    System.out.println(e2.getemp_id());
    System.out.println(e2.getemp_name());
    EmployeeDetails e3= new EmployeeDetails();
    e3.setemp_id(3);
    e3.setemp_name("maan");
    System.out.println(e3.getemp_id());
    System.out.println(e3.getemp_name());
    return List;
 }
 
 public	HashMap<Integer, EmployeeDetails> getEmployeeMap(List<EmployeeDetails> list){
		HashMap<Integer,EmployeeDetails> map = new HashMap<Integer, EmployeeDetails>();
		for(int i = 0; i < list.size(); i++) {
			map.put(i+1,list.get(i));
		}
		return map;
 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			HashMap<Integer, EmployeeDetails> employeeMap = getEmployeeMap(getEmployeeMap());

			for(Entry<Integer, EmployeeDetails> entry : employeeMap.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue().getEmployeeId() +entry.getValue().getEmployeeName());
 }
 
}
}