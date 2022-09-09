package arraylist;

import java.util.ArrayList;

public class RemoveallElementsfromanArrayList {

	public static void main(String[] args) {
		ArrayList<Character>list=new ArrayList<Character>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		System.out.println("before remove all");
		System.out.println(list);
		System.out.println("after remove");
		list.removeAll(list);
		System.out.println(list);

	}

}
