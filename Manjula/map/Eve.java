package map;

public class Eve {
	
	
	public String getFirstName()
	{
	String s1="priya";
		return s1;
		
		
	}
	
	public String getLastName()
	{
		String s2="sankar";
		return s2;
		
	}
	public String setFullName(String FirstName,String LastName)
	{
//		Eve obj = new Eve();
//		 FirstName = obj.getFirstName();
//		 LastName=obj.getLastName();
		
		String s3=FirstName+LastName;
		System.out.println("fullname   :  "+s3);
		return s3;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eve e=new Eve();
		
		e.getFirstName();
		e.getLastName();
		e.setFullName( e.getFirstName(), e.getLastName());
	}

}
