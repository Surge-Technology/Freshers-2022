package sep08.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import Sep09.EmployeeDetails;
import arraylist.Add;

public class sirtask 
{
	public static ArrayList<Integer> getempidlst()
	{
		emp.setGetempid(0);
		ArrayList<Integer> id = new ArrayList<Integer>();
	
		return id; 
	}

	public static ArrayList<String> getempnamelist()
	{
		ArrayList<String> name = new ArrayList<String>();
		name.add("Rakesh");
		name.add("AKila");
		name.add("Maan");
		return name;
	}

	public static HashMap<Integer, String> getempmap(ArrayList<Integer> list, ArrayList<String> List1) 
	{
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		for (int i = 0; i < list.size(); i++) 
		{

			map1.put(list.get(i), List1.get(i));
			//System.out.println("36" + map1);
		}
		return map1;
	}

	public static void main(String[] args) 
	{
		ArrayList<Integer> empidlist = getempidlst();
		ArrayList<String> empnamelist = getempnamelist();
		HashMap<Integer, String> getempmap = getempmap(empidlist, empnamelist);
		System.out.println(getempmap);

		for (Entry<Integer, String> set : getempmap.entrySet()) 
		{
			System.out.println(set.getKey() + " = " + set.getValue());
		}
	}
}
