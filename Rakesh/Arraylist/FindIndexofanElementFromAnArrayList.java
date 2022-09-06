package arraylist;

import java.util.ArrayList;

public class FindIndexofanElementFromAnArrayList {
	  public static void main(String[] args) {
		   ArrayList<String> Colour =new ArrayList<String>();
		    Colour.add("White");
		    Colour.add("Black");
		    Colour.add("Red");
		    Colour.add("Green");
			Colour.add("Yellow");
			System.out.println(Colour);
			int color=Colour.indexOf("Black");
			System.out.println(color);
	}
}
