import java.util.ArrayList;
import java.util.List;

public class Comparelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.add(2);
		b.add(3);
		b.add(1);
		System.out.println(a==b);
	}

}
