package ArraylistPrograms;

import java.util.ArrayList;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("nanded");
		list.add("pune");
		list.add("chennai");
		list.add("mumbai");
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}

	}

}
