package Muralitask;

public class A {
	public  String  Firstname ;
	public  String Secondname;
public  String getFirstname() {
		String Fn="divya";
		return Fn;
	}
	public  String getSecondname() {
		String Sn="soundarrajan";
		return Sn;
	}
	
public   String setFullname(String Firstname, String Secondname)	
{
	String s3=Firstname+Secondname;
	
	System.out.println("Fullname : "+s3);
	return s3;
	
	 
}
public static  void main(String[] args) {
       A obj=new A();
       obj.getFirstname();
       obj.getSecondname();
     obj.setFullname(obj.getFirstname(),obj.getSecondname());
    // System.out.println();
     

}
}


