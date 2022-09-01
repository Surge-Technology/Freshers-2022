package shreyashTask;

public class RemoveWhiteSpaceFromStringWithoutUsingReplace {

	public static void main(String[] args) {
		String name = "Rakesh anand";
		String s1 = "";
		for (int i = 0; i < name.length(); i++)

		{
			char ch = name.charAt(i);
			if (ch != 32) {
				s1 = s1 + ch;
				// System.out.println(s1);
			}
			// System.out.println(s1);
		}
		System.out.println(s1);
	}

}
