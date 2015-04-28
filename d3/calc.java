import java.util.Scanner;
public class calc
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
double p = 0.0;
double q = 0.0;
double answer = 0.0;
//get inputs
String str1 = System.console().readLine();
p = Double.parseDouble(str1);
System.out.println("Entered: " + p);
String str2 = System.console().readLine();
q = Double.parseDouble(str2);
System.out.println("Entered: " + q);
System.out.println("What to do?  a = add, s = subtract, m = multiply, d = divide:");
String str = System.console().readLine();
System.out.println("Entered: " + str);
// calculate
if (str.equals( "a")) {
	answer = p + q;
}
if (str.equals( "s")) {
	answer = p - q;
}
if (str.equals( "m")) {
	answer = p * q;
}
if (str.equals( "d")) {
	answer = p / q;
}
//output
System.out.println("The answer is: " + answer);
}}

