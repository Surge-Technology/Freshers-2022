package Assessment1;
//1)Write a Java Program to remove all white spaces from a string with using place)

public class whitespace {

	public static void main(String[] args) {
		String A="d  i  v  y  a";
		System.out.println("original sentense:"+A);
		
		A=A.replaceAll("\\s","");
		System.out.println("after replacement:"+A);
	}

}
