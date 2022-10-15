package eightnine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpList {
	public List<EmpnameList> maleemp() {
		List<EmpnameList> maleemp = new ArrayList<EmpnameList>();
		EmpnameList emp1 = new EmpnameList();
		emp1.setEmp_id(1);
		emp1.setEmp_name("rakesh");
		maleemp.add(emp1);
		EmpnameList emp2 = new EmpnameList();
		emp2.setEmp_id(2);
		emp2.setEmp_name("maan");
		maleemp.add(emp2);

		EmpnameList emp3 = new EmpnameList();
		emp3.setEmp_id(3);
		emp3.setEmp_name("mohan");
		maleemp.add(emp3);
		return maleemp;
	}

	public List<EmpnameList> Femaleemp() {
		List<EmpnameList> femaleemp = new ArrayList<EmpnameList>();

		EmpnameList emp4 = new EmpnameList();
		emp4.setEmp_id(4);
		emp4.setEmp_name("bala");
		femaleemp.add(emp4);

		EmpnameList emp5 = new EmpnameList();
		emp5.setEmp_id(5);
		emp5.setEmp_name("manju");
		femaleemp.add(emp5);
	
		EmpnameList emp3 = new EmpnameList();
		emp3.setEmp_id(3);
		emp3.setEmp_name("mohan");
		femaleemp.add(emp3);

		return femaleemp;
	}
	
	public HashMap<Integer,String> duplicate() {
		HashMap<Integer, String> dup =new HashMap<>() ;
		List<EmpnameList>d1=maleemp();
		List<EmpnameList>d2=Femaleemp();
		for(EmpnameList item : d1) {
			for(EmpnameList item1: d2) {
				if(item.emp_name.equals(item1.emp_name)) {
					System.out.println(item.emp_id+" "+item.emp_name);
					dup.put(item.emp_id, item.emp_name);
				}
			}
		}
		
		return dup;
	}
public HashMap<Integer,String> emplist() {
	HashMap<Integer, String> empList =new HashMap<>() ;
	List<EmpnameList>l1=maleemp();
	EmpnameList e1 = new EmpnameList();
	List<EmpnameList>l2=Femaleemp();
	EmpnameList e2 = new EmpnameList();
	for(int i=0;i<l1.size();i++) {
		e1=l1.get(i);
		empList.put(e1.getEmp_id(),e1.getEmp_name());
	}


	for(int j=0;j<l2.size();j++) {
		e2=l2.get(j);
		empList.put(e2.getEmp_id(), e2.getEmp_name());
	}
	return empList;
}


	public static void main(String[] args) {
		EmpList  obj=new EmpList();
		obj.duplicate();
		//System.out.println(obj.emplist());
		
				}
				
			}
