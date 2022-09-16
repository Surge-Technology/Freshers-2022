import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Duplicatefind {
	public static HashMap<Integer,String> main(String[] args) {
	HashMap<Integer,String> office(){
	HashMap<Integer,String> A=new HashMap<>();
	HashMap<Integer,String> B=new HashMap<>();
	
	A.put(1,"cts");
	A.put(2,"cts" );
	A.put(3, "wipro");
	A.put(4, "capgemini");
	A.put(5, "qspider");
	String x,y;
		
	for(Entry<Integer, String> e :A.entrySet()) {
			x=e.getValue();	
			int count=0;
          for(Entry<Integer,String> f:A.entrySet()) {
			y=f.getValue();
		                                                        
			if(x==y) {
				count++;	                                                  
			}
			B.put(count, y);
			System.out.println(B);
		}
		System.out.println(x+" "+count);
		return A;
		
	}
	}

	//public static void main(String[] args)_
	Duplicatefind  list=new Duplicatefind();
	 list.office();

	}	



	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
