package map;

import java.util.HashMap;
import java.util.Map;
public class HashMap1 {
	public static void main(String[] args) {

		HashMap<Integer,String> emp=new HashMap<Integer,String>();
		
		emp.put(1,"one");
		emp.put(2,"two");
		emp.put(3,"three");
		emp.put(4,"four");
		for(Map.Entry m : emp.entrySet())
		{
					System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
