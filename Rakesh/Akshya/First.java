package Sep12task;

public class First {
	public String getfirstname() {
		String firstname = "Rakesh";
		return firstname;

	}

	public String getsecondname() {
		String secondname = "Anand";
		return secondname;

	}

	public String setfullname(String firstname, String secondname) {
		String s3 = firstname + secondname;
		System.out.println(s3);
		return s3;
	}

	public static void main(String[] args) {
		First sc = new First();
		sc.getfirstname();
		sc.getsecondname();
		sc.setfullname(sc.getfirstname(), sc.getsecondname());

	}
}
