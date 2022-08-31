package shreyas;

public class CommanArrayElements {
	public static void main(String[] args) {
	  int[] numArray1 = {10, 4, 20};
      int[] numArray2 = {6, 10, 8, 34, 20};
     
      for(int i = 0; i < numArray1.length; i++){
       for(int j = 0; j < numArray2.length; j++){
        if(numArray1[i] == numArray2[j]){
         System.out.println(numArray1[i]);
         break;
        }
       }
      }

}
}