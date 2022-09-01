package shreyas;

public class CharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'p';
		System.out.println(c);
		String sc = " " + c;
		String sc1 = Character.toString(c);
		String sc2 = String.valueOf(c);
		System.out.println("Covertion using concat method:" + sc);
		System.out.println("Covertion using toString() method:" + sc1);
		System.out.println("Covertion using String.valueof() method:" + sc2);
    
	}

}
