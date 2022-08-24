package encapsulation;

public class AccountMain {
	public static void main(String[] args) {  
	     
	    Account acc=new Account();  
	     
	    acc.setAccno(13299912332L);  
	    acc.setName("Rakesh");  
	    acc.setEmail("rakesh19@gmail.com");  
	    acc.setAmount(1200000f);  
	    System.out.println(acc.getAccno()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
	}  
	
}
