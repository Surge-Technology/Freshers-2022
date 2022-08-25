package day1;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("....For loop...");
		int i=1;
		for(i=1;i<=20;i++)
		{
			System.out.println(i+"*"+19+"="+i*19);
		}
		System.out.println("...do while...");
		int x=1;
		do{
			System.out.println(x+"*"+19+"="+x*19);
			x++;
		}while(x<=15);
		System.out.println("...while...");
		int j=1;
		while(j<=20)
		{
			System.out.println(j+"*"+19+"="+j*19);
			j++;
		}

	}

}
