package test05092022;
public class Voteing 
{
	public static void main(String[] args)
	{
		int age = 12;
		try 
		{
			if (age <= 18)
			{
				throw new NumberFormatException("You are not eligible");
			} 
			else 
			{
				System.out.println("you are eligible");
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e);

		}
	}
}