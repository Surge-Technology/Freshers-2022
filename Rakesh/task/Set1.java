package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
 public static void main(String[] args) {
	 	Set<Integer> obj=new TreeSet<Integer>();
	 	obj.add(12);
	 	obj.add(21);
	 	obj.add(41);
	 	obj.add(11);
	 	obj.add(71);
	 	for(int i:obj) {
	 	System.out.println(obj);
	 	}
}
}
