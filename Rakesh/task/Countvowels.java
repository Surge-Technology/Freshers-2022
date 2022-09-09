package sangethatask.com;

public class Countvowels {
	static int countVowels(String str) {
		int n = str.length();
		String vow = "aeiou";
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < vow.length(); j++) {
				if (str.charAt(i) == vow.charAt(j)) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		String str = "welcome to java program";
		System.out.println(str);
	}

}
