package Assessment1;
//Write a Java Program to find the duplicate characters in a string
public class duplicate {

	public static void main(String[] args) {
		String A= "Independense";
        char[] B=A.toCharArray();
		System.out.println("String :"+A);
		System.out.println("duplicate char:");
		for(int i=0;i<A.length();i++) {
			for(int j=i+1;j<A.length();j++) {
				if(B[i]==B[j]) {
					System.out.println(B[j]+"");
					break;
				}
			}
		}
	}
}
