package Surge;

public class FirstNonRepeatCharacter {

	public static void main(String[] args) {    
		String str = "vijaysvijay";

		for (char i : str.toCharArray()) {
			if (str.indexOf(i) == str.lastIndexOf(i)) {
				System.out.println(i);
				break;
			}

		}
	}

}
