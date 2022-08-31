class MemoryManagement
 {
	static void fun()
	{
	System.out.println("static methods");
      }
	
	void run()
      {

        System.out.println("non static method");
      }
}
public class MemoryManagementMain
{
public static void main(String[] args)
{
MemoryManagement mm = new MemoryManagement();
mm.run();
MemoryManagement.fun();

}
}


