package arraylist.com;
import java.util.ArrayList;

import java.util.List;

public class Replacearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>();
		a.add("divya");
		a.add("rose");
		a.add("jasmine");
		a.add("lilly");
		System.out.println("before replace"+a);
		a.set(1, "mine");
		System.out.println("after replace"+a);
	}

}
