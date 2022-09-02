// Program to Handle Divide by Zero and Multiple Exceptions

package task;

public class task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            int number[] = new int[10];
	            number[10] = 10 / 0;
	        }
	        catch (ArithmeticException e) {
	            System.out.println(
	                "Zero cannot divide any number");
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println(
	                "Index out of size of the array");
	        }
	    }

	}


