package september17;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

	public class Employeecity {
		public List<String> empName() {
			List<String> list = new ArrayList<String>();
			list.add("MaanRaj");
			list.add("Madan");
			//System.out.println(list);
			return list;
		}
		public List<String> empCity() {
			List<String> list1 = new ArrayList<String>();
			list1.add("chennai");
			list1.add("Theni");
			//System.out.println(list1);
			return list1;
		}
		public HashMap <String,String> employeeeHashMap (List<String>name,List<String>city){
			HashMap<String,String> map=new HashMap<String,String>();
					for(int i=0;i<name.size();i++) {
				map.put(empName().get(i), empCity().get(i));
				System.out.println(map);
			}
			return map;	
	}
		public static void main(String[] args) {
			Employeecity em=new Employeecity();
			HashMap<String,String>employeeeHashMap1=new HashMap<String,String>();
			employeeeHashMap1=em.employeeeHashMap(em.empName(),em.empCity());
			for(Entry<String, String> ent:employeeeHashMap1.entrySet()) {
				System.out.println(ent.getKey()+" "+ent.getValue());
			}
			
			
	}
	}

