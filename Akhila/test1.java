
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 22 ;
		
		
		try {
			if(age>=18) {
				System.out.println("you are eligible");
			}
			age=Integer.parseInt("Akhila");
			System.out.println(age);
            
        } catch(NumberFormatException e) {
            System.out.println(e);
           
        }
		


	}

}
