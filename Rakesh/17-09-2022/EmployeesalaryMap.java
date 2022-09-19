package sep17;

import java.util.HashMap;
import java.util.Map.Entry;

public class EmployeesalaryMap {	
	public HashMap<String, String>getEmpSalmap(){
		HashMap<String, String> sal = new HashMap<>();
		sal.put("1001", "10000");
		sal.put("1002", "20000");
		sal.put("1003", "30000");
		sal.put("1004", "40000");
		return getEmpSalmap();
	}
	public 	HashMap<String, String> SwappHashMap(HashMap<String, String> sal){
		HashMap<String, String> SwapHashMap=new  HashMap<String,String>();
		for(Entry<String, String> entry:sal.entrySet()) {
			SwapHashMap.put(entry.getKey(), entry.getValue());
		}
		return SwapHashMap;
		}
		 public static void main (String[]args) {
			 EmployeesalaryMap s=new  EmployeesalaryMap ();
			for(Entry <String,String > entry : s.SwappHashMap(s.getEmpSalmap()).entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
		 }
}