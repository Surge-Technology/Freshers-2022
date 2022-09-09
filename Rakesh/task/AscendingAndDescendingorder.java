package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AscendingAndDescendingorder {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rakesh");
		list.add("Sanjay");
		list.add("Sanjay");
		list.add("Mahesh");
		//list.add(null);
		System.out.println("original list:"+list);
		Collections.sort(list);
		System.out.println("Asscending:"+list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Descending:"+list);



	}

}
