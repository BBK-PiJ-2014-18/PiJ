import java.util.Scanner;
public class day1_6
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str1 = System.console().readLine();
int i = Integer.parseInt(str1);

String str2 = System.console().readLine();
int j = Integer.parseInt(str2);

int result = 0;
int test = 7;
int carry = 0;

while (test == 7) {

	result = result + 1;
	i = i - j;
	
		if (i < j) {
			carry = i;
			test = 8;
		}

}

	




System.out.println ("answer: " + result + ", leaving: " + carry);
}}

