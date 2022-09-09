
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment1 {
	public ArrayList<Integer> getempidlist(){
		
		ArrayList<Integer> id= new ArrayList<Integer>();
		id.add(1);
		id.add(2);
		id.add(3);
		return id;
	}
	public ArrayList<String> getempnamelist(){
		ArrayList<String> Name=new ArrayList<String>();
		Name.add("Akhila");
		Name.add("Pratiksha");
		Name.add("Murali");
		return Name;
	}
	public HashMap<Integer,String> getempMap(ArrayList<Integer> list,ArrayList<String> List1 ){
		HashMap<Integer,String> map=new HashMap<>();
			for(int i=0;i<list.size();i++) {
				map.put(list.get(i),List1.get(i));
			}
			
			for (Map.Entry<Integer,String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() +" "+entry.getValue());
	                              
			}
				
		return map;
		
	}
	
    
	public static void main(String[] args) {                    
		// TODO Auto-generated method stub
	 Assignment1 obj1=new Assignment1();
	 ArrayList<Integer> empidlist= obj1.getempidlist();
	  ArrayList<String> emplnamelist = obj1.getempnamelist();
	    HashMap<Integer,String> empmap=obj1.getempMap(empidlist, emplnamelist);
	    System.out.println(empidlist);
	    System.out.println(emplnamelist);
	    System.out.println(empmap);

	}

}
