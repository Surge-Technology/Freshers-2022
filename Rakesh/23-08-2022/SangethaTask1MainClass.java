package interace;

public class SangethaTask1MainClass implements  SangeethaTask1 {
  public static void main(String[] args) {
	  SangeethaTask1 result=new  SangethaTask1MainClass();
	  result.getname("rakesh");
}

@Override
public void getname(String name) {
	System.out.println(name);
	
}
}
