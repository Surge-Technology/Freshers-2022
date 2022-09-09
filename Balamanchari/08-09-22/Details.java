package eightnine;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Details {
	
	  public static void main(String[] args) {
	    List<String> empname= Arrays.asList("bala","lava","manju");
	    List<Integer> empid = Arrays.asList(123,345,546);
	    Map<String,String> map = new LinkedHashMap<String,String>();

	    for (int i=0; i<empname.size(); i++) {
	      map.put(empid.get(i), empname.get(i));    
	    }

	    System.out.println(map);
	  }
	}

