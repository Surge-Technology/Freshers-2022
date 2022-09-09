package MapPrograms;

import java.util.HashMap;

public class RetrieveValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		System.out.println(map.get("three"));
		System.out.println(map.get("two"));

	}

}
