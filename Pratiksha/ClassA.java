import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ClassA {
	public  ArrayList<Integer> EmpId() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		return list;
	}		
				
	
	public  ArrayList<String> EmpName() {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("akhila");
		list1.add("rakesh");
		list1.add("maanraj");
		return list1;
		
	}
	
	
	
	public HashMap<Integer,String> Map(ArrayList<Integer> n, ArrayList<String> abc){
		HashMap<Integer,String> map = new HashMap<>();

		
		for(int i=0;i<n.size();i++) {
			map.put(n.get(i), abc.get(i));
		}
		for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() +" "+
                              entry.getValue());
        }
		return map;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj = new ClassA();
		ArrayList<Integer> empId = obj.EmpId();
		ArrayList<String> empName = obj.EmpName();
		
		HashMap<Integer, String> map = obj.Map(empId, empName);
		System.out.println(map);
		System.out.println(empId);
		System.out.println(empName);
	

	}

}
