package MapPrograms;

import java.util.HashMap;
import java.util.Set;

public class RetrieveAllKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "surge");
		map.put(2, "infosys");
		map.put(3, "tcs");
		map.put(4, "wipro");
		map.put(5, "capg");
		Set<Integer> keyset = map.keySet();
		for(Integer key:keyset){
			System.out.println(key);
		}

	}

}
