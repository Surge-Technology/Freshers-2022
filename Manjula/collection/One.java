//maximum length of element
package collection;

import java.util.ArrayList;
import java.util.Collections;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> str= new ArrayList<>();
	str.add("pri");
	str.add("mano");
	str.add("Dugu");
	str.add("aadhi");
	str.add("kanmani");
	System.out.println(str);
//	int Largestlength=str.size();
//	int temp=0;
	
	String len=Collections.min(str);
	System.out.println(len);
	
	len=Collections.max(str);
	System.out.println(len);
	
	}

}
