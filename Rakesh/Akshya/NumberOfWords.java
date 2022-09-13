package Sep12task;

public class NumberOfWords {
	static int countWords(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' || s.charAt(i) == '\t') {
				count += 1;
				while (i != s.length() && (s.charAt(i) == ' ' || s.charAt(i) == '\t')) {
					i++;
				}
			}
		}
		return count + 1;
	}
public static void main(String[] args)
   {

		String str = "God is Great";
		System.out.println(countWords(str));
	}
}
