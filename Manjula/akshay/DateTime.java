package akshay;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.*;


public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate n=LocalDate.of(2022, 9, 15);
		System.out.println(n);
		LocalDate n1=n.minusMonths(10);
		//System.out.println(java.time.LocalDateTime.now());
		
		System.out.println(n1);
		LocalDateTime ab=LocalDateTime.of(2022, 9, 15, 16, 39);
		System.out.println(ab);
		LocalDateTime abc=ab.minusYears(11);
		System.out.println(abc);
		 
		
		
		
		
		
	}

}
