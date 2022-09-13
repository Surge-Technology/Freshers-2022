package eightnine;

public class StrPractice {
	
	  public static void main(String[] args) {
	  
		  String s="Bala";
		  s.concat("Murugadas");
		  System.out.println(s);
		  
		  StringBuffer sb=new StringBuffer("bala");
		  sb.append("manchari");
		  System.out.println(sb);
		  
		  String s1=new String("bala");
		  String s2=new String("bala");
		  System.out.println(s1==s2);
		  System.out.println(s1.equals(s2));
		  
		  StringBuffer sb1=new StringBuffer("bala");
		  StringBuffer sb2=new StringBuffer("bala");
		  System.out.println(sb1==sb2);
		  System.out.println(sb1.equals(sb2));
		 
		
	  
	  }
	  }
	  
	

