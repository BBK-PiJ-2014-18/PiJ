
boolean test = false;
int i;


String str1 = System.console().readLine();
int max  = Integer.parseInt(str1);



while (!test) {

	String str2 = System.console().readLine();
	j = Integer.parseInt(str2);

	if (j > max) {
		max = j;
	}

	if (j == -1) {
		test = true;
	}




}


System.out.println ("max is: " + max);
