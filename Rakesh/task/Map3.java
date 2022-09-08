package Map;

import java.util.HashMap;

public class Map3 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();  
		map.put(1, "Raj");
		map.put(2, "Sanjay");
		map.put(2, "Null");
		map.put(3, "Sanjay");
		map.put(null, "Sanjay");
		map.put(null, null);
		//map.put(2, null);
		System.out.println(map);

	}

}
