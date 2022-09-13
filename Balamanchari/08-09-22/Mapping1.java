package eightnine;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapping1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> practice=new HashMap<Integer,String>();
		practice.put(1, "Bala");
		practice.put(2, "manju");
		practice.put(3, "akil");
		practice.put(4, "pp");
		practice.put(5, "divya");
		
		System.out.println(practice);
		
		Set<Entry<Integer,String>> entrySet=practice.entrySet();
		for(Entry<Integer,String>entry:entrySet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		HashMap<Integer,String> newpractice=new HashMap<Integer,String>();
		newpractice.put(6, "maan");
		newpractice.put(7, "rakesh");
		newpractice.putAll(practice);
		System.out.println(newpractice);
		
		entrySet=newpractice.entrySet();
		for(Entry<Integer,String>entry:entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
