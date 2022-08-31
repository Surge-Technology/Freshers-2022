package shreyas;

public class RemoveWhitespaceWithoutReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love my Country";
		String str2 = "";
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=32) {
				str2=str2+ch;
			}
		}
		System.out.println(str2);

	}

}
