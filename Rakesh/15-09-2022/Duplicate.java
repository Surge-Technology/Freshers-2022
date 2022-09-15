package Sep14;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicate {
	public static void main(String[] args) {
		int count = 0;
		Map<Integer, String> h1 = new HashMap<>();
		Map<String,Integer>h3=new HashMap<>();
		h1.put(1, "Tcs");
		h1.put(2, "Ctc");
		h1.put(3, "wipro");
		h1.put(4, "MicroSoft");
		h1.put(5, "Tcs");
		System.out.println(h1);
//       for(String x:h1.values()) {
//    	   for(String y:h1.values()) {
//    		  // System.out.println(x+ " "+y);
//    		   if(h1.values().equals(h1))
//    		   { 
//    			   count++;
//    			 //System.out.println(h1.);
//    		   }
//    		   }
//    	 //  System.out.println( +" "+count);
		Map<Integer, String> h2 = new HashMap<>();
		String x;
		String y;
		for (Entry<Integer, String> obj : h1.entrySet()) {
			int i = 0;
			x = obj.getValue();
			// System.out.println(l1);
			for (Entry<Integer, String> obj1 : h1.entrySet()) {
				y = obj1.getValue();
				// System.out.println(y);
				if (x.equals(y)) {
					i++;
				}
				h3.put(obj.getValue(),obj.getKey());
				
			
				System.out.println(h3);
			}
			
		}
		
}
}