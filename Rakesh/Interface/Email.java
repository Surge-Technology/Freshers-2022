package interace;

class newEmail {
	
	void mail() {
		System.out.println("sts123@gmail.com");
	}
}


class Email extends newEmail {
	
	void mail() {
		System.out.println("renuka@gmail.com");
	}

	public static void main(String args[]) {
		newEmail obj = new newEmail();
		obj.mail();

		Email ojec = new Email();
		ojec.mail();
		
	}
}