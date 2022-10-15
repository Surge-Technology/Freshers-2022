package thread;
class Mythread extends Thread
{
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("ChildThread="+i);
		}
		
	}
}
public class ParallelRun {

	public static void main(String[] args) {
		Mythread t1=new Mythread();
		t1.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("MainThread:"+i);
		}
		
		

	}

}
