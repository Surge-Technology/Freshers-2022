package encapsulation;

public class PeopleMain {
	 private String name;
	  public String getName() {
		    return name;
		  }

		
		  public void setName(String newName) {
		    this.name = newName;
		  }
		


	public static void main(String[] args) {
		    PeopleMain myObj = new PeopleMain();
		    myObj.name = "Maan"; 
		    System.out.println(myObj.name); 
}
}