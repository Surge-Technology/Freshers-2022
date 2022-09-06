package sept05;

import java.util.ArrayList;

public class EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("List is:"+list);
		for(int i=1;i<6;i++) {
			if(i%2==0) {
				System.out.println("Even no list is:"+i);
			}
			
		}
		

	}

}
