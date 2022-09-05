package Assessment1;

public class Math1 {

	{
		class Math {
		    public final double secret = 2;
		}



		class ComplexMath extends Math {
		    public final double secret = 4;
		}



		class InfiniteMath extends ComplexMath {
		    public final double secret = 8;



		   public void main(String[] numbers) {
		        Math math = new InfiniteMath();
		        System.out.print(math.secret);
		    }
		}
	}

}
