package eve;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,rev="";
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name ");
		name=sc.nextLine();
		int l=name.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			System.out.println("Reversed name is: "+rev);
		}
		

			//unique words
		System.out.println("Non repeating characters: ");
		for(char k:name.toCharArray())
			{
				if(name.indexOf(k)==name.lastIndexOf(k))
				System.out.println(" "+k);
			}
			
			System.out.println();
		}
	
		
	}

	


