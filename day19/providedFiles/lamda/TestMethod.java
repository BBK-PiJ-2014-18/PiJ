package lambda;

public class TestMethod {
	
	static void myMethod(MyFunc f){
		int x = 3;
		int y = 4;
		System.out.println(f.fred(x, y));
	}
	
	public static void main(String[] args) {
		myMethod((x, y) -> x + x + y);
		myMethod((x, y) -> x + y);
		myMethod((x, y) -> x / y);
		MyFunc ff = (x,y) -> x * y;
		myMethod(ff);
	}

}
