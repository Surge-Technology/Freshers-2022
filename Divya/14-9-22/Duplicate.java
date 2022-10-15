import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Muralitask.Employee1;
import java.util.HashMap;
public class Duplicate {
	 List<Employee1> custom1(){
		ArrayList<Employee1> A=new ArrayList<Employee1>();
		Employee1 e1= new Employee1();
		e1.setempid(1);
		e1.setempname("bala");
		A.add(e1);
		
		Employee1 e2=new Employee1();
		e2.setempid(2);
		e2.setempname("guna");
		A.add(e2);
		
		Employee1 e3=new Employee1();
		e3.setempid(3);
		e3.setempname("mohan");
		A.add(e3);
		
		return A;
	}
	
	 List<Employee1> custom2(){
		ArrayList<Employee1> B=new ArrayList<Employee1>();
		Employee1 e1=new Employee1();
		e1.setempid(4);
		e1.setempname("divya");
		B.add(e1);
		
		Employee1 e2=new Employee1();
		e2.setempid(5);
		e2.setempname("bala");
		B.add(e2);
		
		Employee1 e3=new Employee1();
		e3.setempid(6);
		e3.setempname("guna");
		B.add(e3);
		return B;
		
	}
	
	public HashMap<Integer,String> getmap(){
    HashMap<Integer,String> h1=new HashMap<Integer,String>();
	List<Employee1>  male=custom1();
    List<Employee1> female =custom2();
    for(int i=0;i<male.size();i++) {
    	Employee1  x= male.get(i);
    	h1.put(x.getempid(),x.getempname());
    }
    for(int j=0;j<female.size();j++) {
    	Employee1 y=female.get(j);
    	h1.put(y.getempid(),y.getempname());
    }
    System.out.println(h1);
	return h1;
    }
	
	
	public HashMap<Integer,String> getduplicate(){
		HashMap<Integer,String> h2= new HashMap<>();
		List<Employee1>  male1=custom1();
	    List<Employee1> female2 =custom2();
	    for(Employee1 item: male1) {
	    	//System.out.println(item.getempname());
	    	for(Employee1 item1:female2) {
	    		if(item.getempname().equals(item1.getempname())){
	    			System.out.println(item.getempname());
	    		}
	    	}
	    }
	    
		return h2;
	}
	
	public static void main(String[] args) {
		Duplicate s1=new Duplicate();
		s1.getmap();
		s1.getduplicate();
	
		
	}

	
}



	


	