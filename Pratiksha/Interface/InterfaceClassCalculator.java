package Interface;

public class InterfaceClassCalculator implements InterfaceCalculator {

	@Override
	public double Addition(double a, double b) {
		// TODO Auto-generated method stub
		return (a+b);
		
	}

	@Override
	public double Substraction(double a, double b) {
		// TODO Auto-generated method stub
		return (a-b);
		
	}

	@Override
	public double Multiplication(double a, double b) {
		// TODO Auto-generated method stub
		return (a*b);
		
		
	}

	@Override
	public double Division(double a, double b) {
		// TODO Auto-generated method stub
		return(a/b);
		
	}

}
