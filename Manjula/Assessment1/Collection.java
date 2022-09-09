package renuka;

import java.util.ArrayList;
import java.util.List;


public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraylist
        List<String>arrayList=new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Guava");
        arrayList.add("Sapota");
        arrayList.add("Berry");
        arrayList.add("Peanut");
        arrayList.add("jam");
        System.out.println("ArrayList\n "+arrayList);
       
       
        
        System.out.println("First Elementin array: "+arrayList.get(0));
       System.out.println("If not found any Element:");
       System.out.println(arrayList.indexOf("puppy"));
        
        System.out.println("Index of the Element");
       
        System.out.println(arrayList.lastIndexOf("Guava"));
        
        //remove array
        arrayList.remove(1);
        arrayList.set(3,"buy list");
        
        System.out.println(arrayList);
        System.out.println("size of the array: "+arrayList.size());
        
        //Create Sublist from list
        System.out.println("Sublist of arrayList : " +arrayList.subList(0, 3));
        
      //Search elements-indicates true or false
      		System.out.println("Search elements in list: "+arrayList.contains("jam"));

       //Extract the elements
      		String some=arrayList.get(4);
      		some=arrayList.get(5);
      		System.out.println("Extract Some of the Elements: "+some);
      		
      		
        }

}
