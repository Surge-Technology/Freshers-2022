package Map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(172, "Rakesh");
		map.put(175, "mohan");
		map.put(174, "Maan");
		map.put(172, "Rajesh");
		map.put(172, "");
		System.out.println(map);
	}
}
