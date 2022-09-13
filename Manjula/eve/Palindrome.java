package eve;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String word="welcome to java program";
	int vowels=0;
	for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
			
			vowels++;
			}
			
		}
	System.out.print(vowels);
	}
}
	

		
		
		