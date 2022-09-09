package Map;

import java.util.ArrayList;

public class Duplicatenumber 
{
	 public static void removeDuplicates(int[] a)
	    {
	        ArrayList<Integer> list= new  ArrayList<Integer>();
	
	        for (int i = 0; i < a.length; i++)
	            list.add(a[i]);
	 
	      System.out.print(list);
	    }
	 
	  
	    public static void main(String[] args)
	    {
	        int a[] = {5,2,6,8,6,7,5,2,8};
	       removeDuplicates(a);
	        
	}
}