package assesment050922;

//import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;

public class A {
	public static ArrayList<Integer> getEMPID() {
		ArrayList<Integer> id = new ArrayList<Integer>();
		id.add(172);
		id.add(173);
		id.add(174);
		return id;

	}

	public static ArrayList<String> getEMPNAME() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Maanraj");
		name.add("Rakesh");
		name.add("Akhila");
		return name;

	}

	public static HashMap<Integer, String> getempmap(ArrayList<Integer> list, ArrayList<String> List1) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();

		for (int i = 0; i < list.size(); i++) {

			map1.put(list.get(i), List1.get(i));
			System.out.println("33" + map1);
		}
		return map1;
	}

	public static void main(String[] args) {

		ArrayList<Integer> empidlist = getEMPID();
		ArrayList<String> empnamelist = getEMPNAME();
		HashMap<Integer, String> getempmap = getempmap(empidlist, empnamelist);
		System.out.println(getempmap);
//		Iterator itr=set.iterator();  
//		while (itr.hasNext()) {
		for (Map.Entry<Integer, String> set : getempmap.entrySet()) {
			System.out.println(set.getKey().toString() + " = " + set.getValue());
		}

	}
}
