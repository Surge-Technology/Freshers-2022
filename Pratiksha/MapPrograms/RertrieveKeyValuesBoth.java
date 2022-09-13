package MapPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RertrieveKeyValuesBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "akhila");
		map.put(2, "pratiksha");
		map.put(3, "sneha");
		map.put(4, "neha");
		map.put(5, "avanti");
		Set<Entry<Integer,String>> keyvalueset =map.entrySet();
		for(Entry<Integer,String> entry:keyvalueset) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}

}
