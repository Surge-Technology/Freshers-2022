package Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetPutMap 
{
	public static void main(String[] args) 
	{
		ArrayList<String> name = new ArrayList<String>();
		name.add("Rakesh");
		name.add("Anand");
		name.add(0, "vignesh");
		name.set(0, "Akhil");
		name.add(null);
		System.out.println(name.get(2));
		System.out.println(name);
		for (String i : name) {
			System.out.print(i + " ");
		}
		
		System.out.println("****************************************");
		TreeSet<String> nameSet = new TreeSet<String>();
	    nameSet.add("arun");
	    nameSet.add("prasath");
	    nameSet.add("Rocky");
	    nameSet.add("Sanjay");
	    //nameSet.add(null);
	    //System.out.println(nameSet.contains("arun"));
	    System.out.println(nameSet);// tree set won't allow null
	    System.out.println("****************************************");
	    SortedSet<String> nameSet1 = new TreeSet<String>();
	    nameSet1.add("arun");
	    nameSet1.add("prasath");
	    nameSet1.add("Rocky");
	    nameSet1.add("Sanjay");
	    System.out.println(nameSet1);
	}
}