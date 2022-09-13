package eightnine;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Mapping2 {

	public static void main(String[] args) {
		HashMap<Integer,String> num=new HashMap<Integer,String>();
		num.put(1, "bala");
		num.put(2, "akhila");
		num.put(3, "manju");
		num.put(4, "pp");
		num.put(5, "divya");
		num.put(2, "akhi");
		num.putIfAbsent(11,"Bala");
		num.putIfAbsent(6, "maan");
		
		Set<Entry<Integer,String>>entrySet=num.entrySet();
		for(Entry<Integer,String>entry : entrySet) {
		System.out.println(entry.getKey()+ ":"+entry.getValue());
		}
		String value=num.get(1);
		System.out.println(value);
		
		System.out.println(num.containsKey(1));
		System.out.println(num.containsValue("lava"));
		
		System.out.println(num.size());
		
		Set<Integer>KeySet=num.keySet();
		for(Integer Key:KeySet) {
			System.out.print(Key+ " ");
		}
		System.out.println();
		
		Collection<String>Values=num.values();
		for(String value1:Values) {
			System.out.print(value1+ " ");
		}
		System.out.println();
		num.remove(11);
		System.out.println("after removing: "+num);
		
		num.replace(6, "maanraj");
		System.out.println("after replacing: "+num);
		
		num.replace(1, "bala", "balamanchari");
		System.out.println("After replacing with old value: "+num);
	}

}
