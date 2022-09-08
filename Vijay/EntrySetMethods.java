package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySetMethods {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();

		m.put("vijay", 20000);
		m.put("Sam", 50000);

		Set s1 = m.entrySet();
		Iterator itr = s1.iterator();

		while (itr.hasNext()) {

			Map.Entry m1 = (Map.Entry) itr.next();

			System.out.println(m1.getKey() + " " + m1.getValue());

			if (m1.getKey().equals("vijay")) {

				m1.setValue(30000);
			}
		}
		System.out.println(m);
	}

}
