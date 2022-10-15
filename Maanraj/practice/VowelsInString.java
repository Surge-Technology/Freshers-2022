package assesment050922;

public class VowelsInString {

	public static void main(String[] args) {
		String st = "welcome to java program";
		int count = 0;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o'
					|| st.charAt(i) == 'u') {
				count++;

			}
			System.out.println(count);

		}
	}

}
