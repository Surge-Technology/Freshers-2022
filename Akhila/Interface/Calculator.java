package Interface;

public class Calculator implements CalculatorInterface {

	@Override
	public double Addition(double a, double b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	@Override
	public double Substraction(double c, double d) {
		// TODO Auto-generated method stub
		return (c-d);
	}

	@Override
	public double Multiplication(double e, double f) {
		// TODO Auto-generated method stub
		return (e*f);
	}

	@Override
	public double Division(double g, double h) {
		// TODO Auto-generated method stub
		return (g/h);
	}

}
