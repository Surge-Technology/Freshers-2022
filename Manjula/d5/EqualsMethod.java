package d5;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Mind thought";
		String s2="Will be Change";
		
		System.out.println("s1 is equals to s2 "+s1.equals(s2));
		
		//String and integer
		String str="34";
		int num=34;
		//System.out.println("String and Number is equal:" +str.equals(num));
		System.out.println("String and number are equal:" +Integer.valueOf(str).equals(num));
	}

}
