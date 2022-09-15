package Muralitask;
import java.util.ArrayList;
import java.util.HashMap;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
	public static ArrayList<Integer> empid(){
		ArrayList<Integer> empid=new ArrayList<Integer>();
		empid.add(1);
		empid.add(2);
		empid.add(3);
		return;
		}
	
		public static ArrayList<String> empname(){
		ArrayList<String> empname= new ArrayList<String>();
		empname.add("divya");
		empname.add("pp");
	empname.add("akila");
		return empname;
		}
		
		public HashMap<Integer,String> EmpList(ArrayList<Integer>a,ArrayList<String>b){
			HashMap<Integer,String> EmpList=new HashMap<>();
			return EmpList;
	 	}
		
	public static void main1(String[] args) {
		Employee1 obj=new Employee1();
		obj.getempname();
		obj.getempid();

	}
	}

}
