package Abstract;

public class Sounds extends Animals{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sounds s1=new Sounds();
		s1.Cats();
		s1.dogs();
		

	}

	@Override
	void Cats() {
		// TODO Auto-generated method stub
		System.out.println("cats meow");
	}

	@Override
	void dogs() {
		// TODO Auto-generated method stub
		System.out.println("dog bark");
		
	}

}
