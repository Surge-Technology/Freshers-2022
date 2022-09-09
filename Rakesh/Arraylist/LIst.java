package arraylist;

import java.util.ArrayList;
import java.util.List;

public class LIst {
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		System.out.println(list);

		List<String> listr = list.subList(0, 3);
		System.out.println(listr);
	}
}
