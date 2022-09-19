package arraylist.com;
import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;

public class Employee {
   public ArrayList<String> Empname(){
	  ArrayList<String> list =new ArrayList<String>();
	   list.add("divya");
	   list.add("balaji");
	   list.add("maandraj");
	   list.add("rakesh");
	 return list;
	}

   public ArrayList<String> Empcity(){
	  ArrayList<String> A=new ArrayList<String>();
		A.add("pattukkottai");
		A.add("Tiruvannamalai");
		A.add("chennai");
		A.add("velur");
	  return A;
	}
 
public HashMap<String,String> bd (List<String>list, List<String>A)
{
	HashMap<String,String> emp=new HashMap<String,String>();
	for(int i=0;i<list.size(); i++)
	{
		emp.put(list.get(i), A.get(i));
	}
	return emp;

}

public static void main(String[] args) {
	Employee e=new Employee();
	HashMap<String,String> emplist=new HashMap<String,String>();
	emplist=e.bd(e.Empcity(), e.Empname());
	for(Entry<String,String>entry:emplist.entrySet()) {
		System.out.println("key:"+entry.getKey()+" "+"value:"+entry.getValue());
	}
}
}