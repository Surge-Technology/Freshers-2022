package eightnine;

import java.util.ArrayList;
import java.util.HashMap;

public class EmpName {
	
public static ArrayList<String>fname() {
		
		ArrayList<String>fname=new ArrayList<>();
		fname.add("bala");
		return fname;
}
public static ArrayList<String>lname() {
	
	ArrayList<String>lname=new ArrayList<>();
	lname.add("manchari");
	return lname;
}
public HashMap<String,String> fullname(ArrayList<String>n,ArrayList<String>a) {
	 HashMap<String,String> fullname = new HashMap<>();
for(int i=0;i<n.size();i++) {
	 fullname.put(n.get(i), a.get(i));
}
return fullname;
}

	public static void main(String[] args) {
		EmpName obj = new EmpName();
		ArrayList<String> fname=obj.fname();
		ArrayList<String> lname=obj.lname();
		System.out.println(fname);
		System.out.println(lname);
		HashMap<String, String> fullname = obj.fullname(fname,lname);
		System.out.println(fullname);
	

	}

}
