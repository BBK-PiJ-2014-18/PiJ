import java.util.Scanner;
public class day1_4
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str1 = System.console().readLine();
int i = Integer.parseInt(str1);
int j = 2;
String result = "blah";

while (j < i) {

	
	
	if (i % j == 0) {
		result = "not";
		break;
	} else {
		result = "prime";
	}
	
	j++;


}

System.out.println (result);
}}

