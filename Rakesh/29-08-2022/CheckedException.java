package exceptionHandling;

import java.io.IOException;

public class CheckedException {

	public static void main(String[] args)  {
		int a=-2;
		if(a>0) {
		try {
			throw new IOException();	
		} catch (Exception e) {
			
		
			e.printStackTrace();
		}
		}
		System.out.println("positive");
		}
		
		

	}


