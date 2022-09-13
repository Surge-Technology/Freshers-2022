package MapPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveSpecifiedKeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(2, "sneha");
		map.put(7, "joshi");
		map.put(6, "neha");
		map.put(9, "avanti");
		map.put(5, "pp");
		Set<Entry<Integer,String>> keys = map.entrySet();
		for(Entry<Integer,String> values:keys) {
			System.out.println("the key is "+values.getKey()+" the value is "+values.getValue());
		}
		System.out.println("-------------------------");
		map.remove(9,"avanti");
		for(Entry<Integer,String> values:keys) {
			System.out.println("the key is "+values.getKey()+" the value is "+values.getValue());
		}
		

	}

}
