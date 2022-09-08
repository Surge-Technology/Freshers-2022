package arraylist.com;

import java.util.ArrayList;

public class evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>even =new ArrayList<Integer>();
		even.add(1);
		even.add(2);
		even.add(3);
		even.add(4);
		even.add(5);
		even.add(6);
		even.add(7);
		System.out.println("even numbers:");
		for(int i=0;i<even.size();i++){ 
			Integer a=even.get(i);
			if(a%2==0) {
				System.out.println(a);
			}
		}
	}

}
//Write a java program to store integer number in array list and print even numbers from it.