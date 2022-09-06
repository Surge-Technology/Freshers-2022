package arraylist.com;

import java.util.ArrayList;
import java.util.Collections;

public class custom {
	public static class Laptop {
	    
	    //Maximum length in the string

	   public static  void main(String[] args) {
	           
	                ArrayList<String> lap = new ArrayList<String>();
	                lap.add("HP");
	                lap.add("Lenovo");
	                lap.add("Compaqo");
	                lap.add("Zensar");
	                lap.add("Dell");
	                lap.add("Apple");
	            
	                Collections.sort(lap,new CustomSorting1());
	                int length = lap.get(0).length();
	                
	                System.out.println(lap);
	                
	                lap.forEach(e->{
	                    
	                    if(e.length()==length) {
	                        System.err.println(e);
	                    }
	                });
	                
}
	}
}


