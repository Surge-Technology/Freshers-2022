package Accessment;

import java.util.HashMap;
import java.util.Map;

public class MapIterator_ConcurrentModification {

	public static void main(String[] args) {
		
		
		Map<String,String> map = new HashMap<String, String>();
		
		map.put("Hello", "Hello");
		map.put("world", "world");
		
		
		for (Map.Entry<String,String> entry : map.entrySet()) 
			map.remove("world");
		System.out.println(map);
	}


}
