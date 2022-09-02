package d5;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Colony";
		char[] ch=str.toCharArray();
		System.out.println("Duplicates characters are:");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
				}
			}
		}

	}

}
