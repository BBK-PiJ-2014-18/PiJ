boolean test = false;
String str1 = System.console().readLine();
int i  = Integer.parseInt(str1);
String result = "Yes";
while (!test) {
	String str2 = System.console().readLine();
	j = Integer.parseInt(str2);

	if (j == -1) {
		test = true;
	} else {
		if (j - i != 1)   {
			result = "No";
		}
	}
	i = j;
}
System.out.println (result);
