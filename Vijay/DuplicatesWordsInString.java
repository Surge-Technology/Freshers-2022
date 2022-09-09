package Surge;

public class DuplicatesWordsInString {

	public static void main(String[] args) {

		String str1 = "black dog is a big black dog";
		String[] str2 = str1.split(" ");
		String str3 = "";
		for (int i = 0; i < str2.length; i++) {
			String str4 = str2[i];
			if (!str3.contains(str4)) {
				str3 = str3 + str4 + " ";

			}
		}

		System.out.println(str2);

	}

}
