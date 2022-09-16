package Sep14;

import java.sql.Date;
import java.text.SimpleDateFormat;
public class Task3 
{
	public static void main(String[] args) 
	{
		String s1 = "Abc";
		String s2 = "ABC";
		String s3 = "dfc";
		boolean result = s1.equalsIgnoreCase(s2);
		boolean result1 = s1.equalsIgnoreCase(s3);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(java.time.LocalDateTime.now());
		String s4 = "Hi Hello Bye";
		String s6=s4.replace(" ", "");
		System.out.println(s6);
		String s5 = "HiHelloBye";
		boolean result3=s6.equalsIgnoreCase(s5);
		System.out.println(result3);
		System.out.println("\"rakesh\"");
	}
}
