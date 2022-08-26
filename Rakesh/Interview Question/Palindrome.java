package interviewQuestion;
import java.util.Scanner;
public class Palindrome 
{
 public static void main(String[] args)
 	{
//            String a,b="";
//            Scanner s1=new Scanner(System.in);
//            System.out.println("Enter the String");
//            a=s1.nextLine();
//            int n=a.length();
//            for(int i=n-1;i>=0;i--)
//            {
//                b=b+a.charAt(i);
//            }
//            if(a.equals(b))
//            {
//                System.out.println("palindrome");
//            }
//            else
//            {
//                System.out.println("Not palindrome");
//            }
//            
//        }
 		String myString = "ianna";
    	StringBuffer sb=new StringBuffer( myString );
    	
    	StringBuffer result =sb.reverse();
    	if (sb.equals(result)){
    		System.out.println("it is a palindrome");
    	}else {
    		System.out.println("not a palindrome");
    	}
    	
    	}
	}
