package training;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "naman";
		String result= "";
		//String rev;
		/*StringBuffer sb = new StringBuffer(name);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);*/
        for (int i=name.length()-1; i>=0; i--) {
        	System.out.println(name.charAt(i));
        	result=result+name.charAt(i);
        	//System.out.println(result);
     
	}
        System.out.println(result);
        if(name.equals(result)) {
        	System.out.println("Palindrome");
        }else {
        	System.out.println("Not Palindrome");
        }
}
}
