package MapPrograms;
import java.util.Collection;
import java.util.HashMap;

public class RetrieveAllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(5, "pooja");
		map.put(3, "renuka");
		map.put(1, "gayathri");
		map.put(4, "bala");
		map.put(2, "manju");
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println(value);
		}
		 
	}


}
