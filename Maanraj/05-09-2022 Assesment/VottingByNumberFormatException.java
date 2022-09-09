package assesment050922;

public class VottingByNumberFormatException {

	public static void main(String[] args) {
		int age = 24;
		try {
			if (age <= 18) {
				throw new NumberFormatException("You are not eligible");
			} else {
				System.out.println("you are eligible");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
