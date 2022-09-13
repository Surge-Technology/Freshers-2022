package MapPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Remove1keyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(2, "sneha");
		map.put(7, "joshi");
		map.put(6, "neha");
		map.put(9, "avanti");
		map.put(5, "pp");
		Set<Entry<Integer,String>> key = map.entrySet();
		for(Entry<Integer,String> value :key) {
			System.out.println(value.getKey()+" : "+value.getValue() );
		}
		System.out.println();
		map.remove(9);
		for(Entry<Integer,String> value :key) {
			System.out.println(value.getKey()+" : "+value.getValue() );
		}

	}

}
