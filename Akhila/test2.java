import java.util.ArrayList;
import java.util.Collections;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(22);
		al.add(10);
		al.add(30);
		al.add(25);
		al.add(15);
		al.add(28);
		al.add(1);
		System.out.println("the list is: "+al);
		Collections.sort(al);
		System.out.println("the sorted list is:"+al);

	}

}
