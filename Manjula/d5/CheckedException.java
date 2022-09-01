package d5;

import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-2;
		if(a>0);
		try
		{
		throw new IOException();
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println("last line");
	}

}
