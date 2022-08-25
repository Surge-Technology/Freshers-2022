package calciSwitch;

public class palindrome {
	public static void main(String[] args) {
		String str="mom";
		String rev="";
       // System.out.println("enter a name");
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
	

}
