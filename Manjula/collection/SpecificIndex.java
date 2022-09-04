//specific Index

package collection;
import java.util.ArrayList;
public class SpecificIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str=new ArrayList<String>();
		str.add("write");
		str.add("read");
		str.add("teach");
		str.add("eat");
		str.add("paper");
		str.add("bottle");
		
		System.out.println("Strings are : "+str);
		System.out.println("Add element at specific index");
		str.add(6, "meditate");
		System.out.println(str);
		
		//remove elements specific index
		str.remove(2);
		System.out.println("Remove Specific Index : "+str);
		
		//create sublist from list
		str.subList(2,5);
		System.out.println("Create sublist from list: "+str);
	}

}
