import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		System.out.println("The number is from list are:"+al);
		for(int i=1;i<8;i++) {
			if(i%2==0)
			{
				System.out.println("The Even number in the list is:"+i);
			}
			}

	}
}
