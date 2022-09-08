package renuka;

import java.util.ArrayList;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(11);
		num.add(2);
		num.add(44);
		num.add(47);
		num.add(50);
		num.add(6);
		num.add(79);
		num.add(8);
		num.add(97);
		num.add(10);
		System.out.println(num);
		
		for(int i=1;i<num.size();i++)
		{
			Integer n=num.get(i);
			if(n%2==0)
			{
				System.out.println("Even Numbers are:" +n);
			}
		}
		

	}

}
