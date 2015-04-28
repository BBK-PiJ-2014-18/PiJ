import java.util.Scanner;
public class day1_3
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str1 = System.console().readLine();
int i = Integer.parseInt(str1);
int j = 2;
String result;

while (j < i) {

	String result = (i % j == 0) ? "prime" : "not";
	j++;


}



System.out.println (result);
}}

