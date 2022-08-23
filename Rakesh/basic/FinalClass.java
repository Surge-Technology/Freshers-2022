package basic;

 final class FinalClass {
	public void display1() {
	    System.out.println("This is a final method.");
	  }
	

	// try to extend the final class
	//class sun extends FinalClass {
	  public  void display() {
	    System.out.println("The final method is overridden.");
	  }

	  public static void main(String[] args) {
	    //Sun obj = new Sun();
	   // obj.display();
	  }
	  
	  
}
