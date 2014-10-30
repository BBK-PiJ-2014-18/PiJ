public class Calculator {
	private int x;
	private int y;
	
	private int add() {
		int result = x + y;
		System.out.println(x + " + " + y + " = " + result);
		return result;
	}
	
	private void subtract() {
		int result = x - y;
		System.out.println(x + " - " + y + " = " + result);
	}
	
	private void multiply() {
		int result = x * y;
		System.out.println(x + " * " + y + " = " + result);
	}
	
	private void modulus() {
		int result = x % y;
		System.out.println("The remainder of " + x + " / " + y + " = " + result);
	}

	private void divide() {
		double a = (double) x;
		double b = (double) y;
		double result = a / b;
		System.out.println(x + " / " + y + " = " + result);
	}
	
	
}	