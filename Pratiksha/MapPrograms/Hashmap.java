package MapPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		Set<Entry<String,Integer>> entrySet =map.entrySet();
		for(Entry<String,Integer> entry :entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		System.out.println("---------------------");
		HashMap<String,Integer> anothermap = new HashMap<String,Integer>();
		anothermap.put("six", 6);
		anothermap.put("seven", 7);
		anothermap.putAll(map);
		entrySet=anothermap.entrySet();
		for(Entry<String,Integer> entry :entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		

	}

}
