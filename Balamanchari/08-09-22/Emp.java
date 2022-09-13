package eightnine;

import java.util.Scanner;

public class Emp {
	
	public String fname() {

		String fname="bala";
		return fname;
		
	}
	
	public String lname() {
		String lname="manchari";
		return lname;
		
		
		
	}

	public String fullname(String fname,String lname) {
		  
		String fullname=fname()+lname();
		System.out.println(fullname);
		return fullname;
		
	}
public static void main(String[] args) {
		
		Emp e1=new Emp();

		e1.fname();
		e1.lname();
		e1.fullname(e1.fname(),e1.lname());
		

	}

}
