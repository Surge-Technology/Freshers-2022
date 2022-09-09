package MapPrograms;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class IffNotInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 2);
		map.put("five", 5);
		map.put(null, null);
		map.put(null, null);
		map.putIfAbsent("four", 4);
		map.putIfAbsent("six", 5);
		Set<Entry<String,Integer>> entryset= map.entrySet();
		for(Entry<String,Integer> entry :entryset) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}

}
