package eve;

public class Uniquewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="welcome to java program";
		
		char[] ch=word.toCharArray();
		System.out.println("Duplicates characters are:");
		for(int i=0;i<word.length();i++)
		{
			for(int j=i+1;j<word.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
				}
		}
		
		}
		
		//unique words
		System.out.println("Non repeating characters: ");
		for(char k:word.toCharArray())
		{
			if(word.indexOf(k)==word.lastIndexOf(k))
			System.out.println(" "+k);
		}
		
		System.out.println();
		
	//
//	int num=word.length();
//	for(int i=num-1;i>=0;i--)
//	{
//		rev=rev+num;
//		if(word.equals(rev))
//		{
//			System.out.println("It is palindrome");
//		}
//		else
//		{
//			System.out.println("It is not a palindrome");
//		}
//	}


	}
}

