package MapPrograms;

import java.util.HashMap;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> objmap = new HashMap<Integer, String>();
		objmap.put(21, "pratiksha");
		objmap.put(null, "manju");
		objmap.put(32, "akhila");
		objmap.put(23, "divya");
		objmap.put(56, "bala");
		objmap.put(87, null);
		System.out.println(objmap.size());
		Set<Integer> objset=objmap.keySet();
		for(Integer ikey:objset) {
			System.out.println(ikey);
			System.out.println(objmap);
		}
		
	}

}
