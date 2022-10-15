package task;

public class hello {

	public static void main(String[] args) {

		System.out.println("hello");
		// TODO Auto-generated method stub
		{
		boolean myobt=true;
				System.out.println(myobt);
		}
	    int obt = 4;
	    double mydob = obt;
	    {
	    System.out.println(mydob);
	    }
	    String crc = "HIOP";
	    {
	    	System.out.println(crc.toLowerCase());
	    }
	    String fn="ram";
	    String ln="jan";
	    {
	    	System.out.println(fn.concat(ln));
	    }
	    int x=5;
	    int y=10;
	    {
	    	System.out.println(Math.max(x,y));
	    }
	
	    for(int i=0;i<=5;i++)
	    {
	    System.out.println("yes");
	    }
	    String[] arr= {"a","b","c","d"};
	    for(String i :arr)
	    {
	    	System.out.println(i);
	    }
	    int[][] era= {{1,34,56,78},{900,9001,78}};
	    {
	    	for(int i=0;i<era.length;i++)
	    	for(int j=0;j<era[i].length;j++)
	    	{
	    	System.out.println(era[i][j]);
	    	}
	    }
	    
	}
}
