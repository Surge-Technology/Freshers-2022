package MapPrograms;

import java.util.HashMap;

public class ExistIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Double> map = new HashMap<Integer,Double>();
		map.put(2, 12.0);
		map.put(3, 23.7);
		map.put(5, 56.3);
		map.put(4, 56.1);
		System.out.println("the key is "+map.containsKey(5)+" and value is "+map.containsValue(56.3));

	}

}
