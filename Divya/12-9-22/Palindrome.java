package Akshay;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				String str="abc";
				String rev="";
		   //    // System.out.println("enter a name");
		int strlength=str.length();
		 for(int i=(str.length()-1);i>=0;i--) {
			rev=rev+str.charAt(i);
			}
			if(rev.equals(str)) {
				System.out.println("it is palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
			}
public static boolean ispalindrome(String str) {
	int left = 0, right = str.length() - 1;
    
    while(left < right)
    {
        if(str.charAt(left) != str.charAt(right))
        {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

		
	}


