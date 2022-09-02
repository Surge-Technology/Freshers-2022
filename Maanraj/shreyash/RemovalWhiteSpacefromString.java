package shreyasAssignment;

public class RemovalWhiteSpacefromString {

	public static void main(String[] args) {
		String s1 = "java is every where";
//		String s2= s1.replace(" ","@");
//		System.out.println(s2);
		String s2 = " ";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch != 32) {
				s2 = s2 + ch;
			}
		}
		System.out.println(s2);
	}
	

}
