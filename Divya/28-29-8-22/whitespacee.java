package Assessment1;
//Write a lava Program to remove all white spaces from a string without using replaced
public class whitespacee {
	public static void main(String[] args) {	
      String A= "java is better";
	  String B="";
	  for(int i=0;i<A.length();i++)
	  {
		char ch=A.charAt(i);
		if(ch!=32)
		{
			B=B+ch;
		}
		
		
	}
	  System.out.println(B);
	}
}