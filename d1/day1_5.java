import java.util.Scanner;
public class day1_5
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str1 = System.console().readLine();
int i = Integer.parseInt(str1);

String str2 = System.console().readLine();
int j = Integer.parseInt(str2);

int count = 1;
int result = 0;

while (count <= j) {

	result = result + i;
	
	
	count++;


}

System.out.println (result);
}}

