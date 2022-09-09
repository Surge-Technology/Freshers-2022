package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntryMethods {

	public static void main(String[] args) {

		Map<Integer, String> mp = new HashMap<Integer, String>();

		mp.put(101, "vijay");
		mp.put(102, "murali");
		mp.put(103, "Siva");
		mp.put(104, "Bharani");

		Set<Integer> s = mp.keySet();
		System.out.println(s);

		Collection<String> s2 = mp.values();
		System.out.println(s2);

		boolean s1 = mp.containsValue("murali");
		System.out.println(s1);
		
		Set<Entry<Integer, String>>m1= mp.entrySet();
		System.out.println(m1);
		
		int i=mp.hashCode();
		System.out.println(i);

	}

}
