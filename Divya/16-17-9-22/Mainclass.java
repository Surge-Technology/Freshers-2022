package Muralitask;

import java.util.HashMap;
import java.util.Map.Entry;

public class Mainclass {
	
	public HashMap<Integer,Integer> getEmp_salarymap(){
		HashMap<Integer,Integer> e1=new HashMap<Integer,Integer>();
		e1.put(1001, 10000);
		e1.put(1002, 20000);
		e1.put(1003, 30000);
		e1.put(1004, 40000);
		return e1;
	}
		public HashMap<Integer,Integer> getswapmap(HashMap<Integer,Integer>e1){
			HashMap<Integer,Integer> e2=new HashMap<Integer,Integer>();
			
			for(Entry<Integer,Integer> entry :e1.entrySet()) {
				e2.put(entry.getKey(), entry.getValue());
			}
			return e2;
			
	}
		public static void main(String []args) {
		Mainclass e=new Mainclass();
		for(Entry<Integer,Integer> entry :e.getswapmap(e.getEmp_salarymap()).entrySet())
        System.out.println("key: "+entry.getKey()+"value: "+entry.getValue());
		}
			
		}
	
