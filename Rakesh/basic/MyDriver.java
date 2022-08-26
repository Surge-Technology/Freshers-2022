package basic;

public class MyDriver {

	public static void main(String[] args) {
		GetterAndsetter s1 = new GetterAndsetter();
		s1.setId(101);
		s1.setName("shaukat");
		updateObject(s1);
		System.out.println(s1.getId() + " " + s1.getName());
	}

	public static void updateObject(GetterAndsetter s2) {
		// System.out.println(s2.getId()+" "+s2.getName());

		s2.setId(102);
		s2.setName("Maanraj");

//System.out.println(s2.getId()+" "+s2.getName());

	}

}
