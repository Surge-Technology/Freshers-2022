import java.util.ArrayList;

public class Typecaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="123";
			int a=Integer.parseInt(s);
			System.out.println(a+10.1);
			System.out.println(" ");
	
			String abc="hi hello bye";
		    String[] arr=abc.split(" ");
			for(String d:arr) { 
				System.out.println(d);
			}
			String j="ABC";
			String h="Abctyui";
			System.out.println("compare   " +j.compareToIgnoreCase(h));
			
			System.out.println(java.time.LocalDateTime.now());
			System.out.println(java.time.LocalDateTime.of(2020, 10, 05,12,05));
			System.out.println(java.time.Clock.systemUTC().instant());
			
				String A="hi   hello   bye";
				String B="hihellobye";
				String c=A.replace(" ", "");
				//System.out.println(c.compareTo(A));
				System.out.println(B.matches(c));
				System.out.println("\"divya\"");
			}
		
	
	
	
	
	
	
	
}
