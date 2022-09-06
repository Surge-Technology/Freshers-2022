package arraylist.com;
import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	
	//Write a java program some elements in arraylist .And sort the arraylist and print
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> sort=new ArrayList<String>();
		sort.add("panda");
		sort.add("dog");
		sort.add("cat");
		sort.add("horse");
		sort.add("girffee");
		System.out.println("before sort:"+sort);
		Collections.sort(sort);
		System.out.println("after sort:"+sort);

	}

}
