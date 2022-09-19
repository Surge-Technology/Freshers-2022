package akshay;
//int integer 
public class IntegerInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//add float in string
		String s="123";
		int i=Integer.parseInt(s);
		
		System.out.println(i+10.1);
		
		//space to next line
		String abc="hi hello bye";
		String[] str=abc.split(" ");
		for(String part:str)
		{
			
		System.out.println(part);
	}
		
		//case ignorance
		String a1="ABC";
		String a2="DEF";
		System.out.println(a1.compareToIgnoreCase(a2));
		
		System.out.println("Date and Time");
		 System.out.println(java.time.LocalDateTime.now());
		 
		 
	System.out.println("equal");
	String x=("hi  hello  byee");
	String y=("hihellobyee");
	String z=x.replace(" ","");
	System.out.println(z);
	System.out.println(z.matches(y));
	
     System.out.println("");
	
	}

}
