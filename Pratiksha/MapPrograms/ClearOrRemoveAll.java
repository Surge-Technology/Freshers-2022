package MapPrograms;

import java.util.HashMap;

public class ClearOrRemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(2,2);
		map.put(3, 5);
		map.put(5, 1);
		map.put(8, 4);
		System.out.println("before size: "+map.size());
		map.clear();
		System.out.println("after size: "+map.size());

	}

}
