package Sep12task;

public class RemoveAccurance {
	static String removeChar(String str, char c) {
		String st = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != c) {
				st += str.charAt(i);
			}
		}
		return st;
	}

	public static void main(String[] args) {
	
		String str = "hhkdjhk";
		char c = 'h';
		System.out.println(str.replace(String.valueOf(c), ""));
		System.out.println(removeChar(str, c));

	}
}