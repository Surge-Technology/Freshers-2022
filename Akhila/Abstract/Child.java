package Abstract;

public  class Child extends parent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.message1();
		
	
		obj.message2();
		
		

	}

	@Override
	void message1() {
		// TODO Auto-generated method stub
		System.out.println("the message 1");
		
	}

	@Override
	void message2() {
		// TODO Auto-generated method stub
		System.out.println("the message 2");
	}

}
     