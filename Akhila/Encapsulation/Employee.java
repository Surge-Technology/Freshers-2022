package Encapsulation;

public class Employee {
	private int no;
    private String name;
   private String Address;
    
    public void setNo(int no) {
        this.no=no;
    }
    public void setName(String name) {
        this.name=name;    
    }
    public void setAddress(String Address)
    {
    	this.Address=Address;
    }
    public int getNo() {
        return no;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
    	return Address;
    }
}


