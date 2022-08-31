package test1;



public class Palidrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Akhila";
		 String result="";
		/*StringBuffer sb=new StringBuffer(s1);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);*/
		for( int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
			result=result+name.charAt(i);
			//System.out.println(result);
			
		}
		System.out.println(result);
		if(name.equals(result)) {
			System.out.println("its palidrome");
		}
		else {
			System.out.println("not palidrome");
		}
			

	}

}
