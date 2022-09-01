package shreyashTask;
import java.io.*;
public class HandleuncheckedException {

	public static void main(String args[]){
		int a=-1;
		if(a<=0){
			
			try{
				throw new IOException();
			}
			catch(Exception e){
				System.out.println(e);

			}
			
		}
		else
		{
			
			System.out.println("no is positive");

		}
		
		System.out.println("Last line");
		
	}
}