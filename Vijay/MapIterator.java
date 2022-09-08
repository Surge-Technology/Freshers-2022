package Map;

import java.util.HashMap;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {
 		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(101, "vijay");
		mp.put(102, "Naveen");
		mp.put(103, "ShivaGuru");
		mp.put(104, "Maanraj");
		mp.put(105, "Murali");
		
		for(Map.Entry<Integer, String> e : mp.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
