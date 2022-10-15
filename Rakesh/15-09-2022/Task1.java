package sep15;

public class Task1 {
      static int x=1111;
      static {
    	  x=x-- - --x;
     
    	  x=x++ + ++x;
      }
      public static void main(String[] args) {
		System.out.println(x);
		//\u000d System.out.println("hi");
		int j2=2;
		System.out.println(java.time.LocalDateTime.now());
		
		
	}
}
