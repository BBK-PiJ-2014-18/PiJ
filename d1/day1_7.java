import java.util.Scanner;
public class day1_7
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String str1 = System.console().readLine();
int i = Integer.parseInt(str1);

String str2 = System.console().readLine();
int j = Integer.parseInt(str2);

String str3 = System.console().readLine();
int k = Integer.parseInt(str3);

int low = i;
int mid = i;
int high = i;

if (j < i) {
	low = j;
	}

if (k < i) {
	low = k;
	}

if (j < k && j < i) {
	low = j;
	}	

if (j > i) {
	high = j;
	}

if (k > i) {
	high = k;
	}

if (j > k && j > i) {
	high = j;
	}

	
if (j != low && j != high) {
	mid = j;
	}

if (k != low && k != high) {
	mid = k;
	}



System.out.println ("low is: " + low + ", middle is: " + mid + ", highest is: " + high);
}}

