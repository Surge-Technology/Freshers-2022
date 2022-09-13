package Muralitask;
import java.util.List;
//import java.util.HashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
//public class Employee {
//	
//	public static ArrayList<Integer> empid(){
//	ArrayList<Integer> empid=new ArrayList<Integer>();
//	empid.add(1);
//	empid.add(2);
//	empid.add(3);
//	return empid;
//	}
//	
//	public static ArrayList<String> empname(){
//	ArrayList<String> empname= new ArrayList<String>();
//	empname.add("divya");
//	empname.add("pp");
//	empname.add("akila");
//	return empname;
//	}
//	
//	public HashMap<Integer,String> EmpList(ArrayList<Integer>a,ArrayList<String>b){
//		HashMap<Integer,String> EmpList=new HashMap<>();
//		return EmpList;
// 	}
//	
//public static void main(String[] args) {
//		Employee1 obj=new Employee1();
//		obj.getname();
//		obj.getid();

//}
public class Employee22{
	
        static List<Employee1>getemplist (List<Employee1>List){
		Employee1 e1=new Employee1();
		e1.setempid(1);
		e1.setempname("divya");
		System.out.println(e1.getempid());
		System.out.println(e1.getempname());
		
		
		Employee1 e2=new Employee1();
		e2.setempid(2);
		e2.setempname("mohan");
		System.out.println(e2.getempid());
		System.out.println(e2.getempname());
		
		Employee1 e3=new Employee1();
		e3.setempid(3);
		e3.setempname("priya");
		System.out.println(e3.getempid());
		System.out.println(e3.getempname());
		return List;
	}
        
	public HashMap<Integer,String> emplist(List<Integer>a,List<String>b){
		HashMap<Integer,String> emplist=new HashMap<>();
		return emplist;
	}
	
		public static void main(String[] args) {
			getemplist(null);
			
			
			
		}
	
}








		
	


