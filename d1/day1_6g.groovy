String str1 = System.console().readLine();
int i = Integer.parseInt(str1);
String str2 = System.console().readLine();
int j = Integer.parseInt(str2);
int result = 0;
boolean test = false;
int carry = 0;
while (!test) {
	result = result + 1;
	i = i - j;
		if (i < j) {
			carry = i;
			test = true;
		}
}
System.out.println ("answered as: " + result + ", leaving: " + carry);
