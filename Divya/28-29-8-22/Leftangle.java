package Assessment1;

public class Leftangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=4;i++) {
			for(j=3;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//     *
//    **
//   ***
//  ****