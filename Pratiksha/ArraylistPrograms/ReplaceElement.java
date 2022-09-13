package ArraylistPrograms;

import java.util.ArrayList;

public class ReplaceElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("akhila");
		list.add("joshi");
		list.add("sneha");
		list.add("neha");
		list.add("avanti");
		System.out.println("before replacing:" +list);
		list.add(2, "ruchi");
		System.out.println("after replacing:" +list);

	}

}
