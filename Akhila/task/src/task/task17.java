//Program to Convert String to Float Value


package task;

public class task17 {
	
		  public static float convertStringtoFloaat(String str) {
		        return Float.parseFloat(str);
		    }



		   public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        String sc = "1.0";
		        System.out.println("Before conversion:" + sc);
		        float FloatValue= convertStringtoFloaat(sc);
		        System.out.println("After conversion:" + FloatValue);


	}

}
