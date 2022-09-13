package Akshay;

public class Intstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12345;
		int b;
		String str=Integer.toString(a);
		str.length();
		System.out.println(str.length());
		
		String A="divya";
		System.out.println(A.codePointAt(3));

		String B="divyabalaji";	
		System.out.println(B.codePointBefore(4));
		System.out.println(B.codePointCount(0, 3));
		System.out.println(B.compareTo("divya"));
		System.out.println(B.compareToIgnoreCase("div"));
		System.out.println(B.concat("natarajan"));
		System.out.println(B.contains("balaji"));
		System.out.println(B.contentEquals("bala"));
		System.out.println(B.endsWith("i"));
		System.out.println(B.equals("div"));
		System.out.println(B.equalsIgnoreCase("bala"));
		System.out.println(B.hashCode());
		
}
}
