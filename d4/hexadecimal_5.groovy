int hexadecimal2decimal (String hexInput) {
	int i = hexInput.length();
	String str;
	int power;
	int hexOutput = 0;
	for (j=0 ; j < i ; j++) {
		str = hexInput.charAt(j);
		hexOutput = hexOutput + getDecSingle(str) * Math.pow(16,i-j-1);
	}
	return hexOutput;
}

String decimal2hexadecimal (int decInput) {
	int remainderDec;
	String hexOutput = "";
	while (decInput >= 0.5) {
		remainderDec = decInput % 16;
		decInput = decInput / 16;
		hexOutput = getHexSingle(remainderDec) + hexOutput;	
	}
	return hexOutput;
}

int getDecSingle (String hex) {
	int dec;
	if (hex == "0") {
		dec = 0;
	}
	if (hex == "1") {
		dec = 1;
	}
	if (hex == "2") {
		dec = 2;
	}
	if (hex == "3") {
		dec = 3;
	}
	if (hex == "4") {
		dec = 4;
	}
	if (hex == "5") {
		dec = 5;
	}
	if (hex == "6") {
		dec = 6;
	}
	if (hex == "7") {
		dec = 7;
	}
	if (hex == "8") {
		dec = 8;
	}
	if (hex == "9") {
		dec = 9;
	}
	if (hex == "a") {
		dec = 10;
	}
	if (hex == "b") {
		dec = 11;
	}
	if (hex == "c") {
		dec = 12;
	}
	if (hex == "d") {
		dec = 13;
	}
	if (hex == "e") {
		dec = 14;
	}
	if (hex == "f") {
		dec = 15;
	}
	return dec;	
}

String getHexSingle(int remainderDec) {
	String remainderHex;
	if (remainderDec <= 9) {
		remainderHex = Integer.toString(remainderDec);
	}
	if (remainderDec == 10) {
		remainderHex = "a";
	}	
	if (remainderDec == 11) {
		remainderHex = "b";
	}	
	if (remainderDec == 12) {
		remainderHex = "c";
	}	
	if (remainderDec == 13) {
		remainderHex = "d";
	}	
	if (remainderDec == 14) {
		remainderHex = "e";
	}	
	if (remainderDec == 15) {
		remainderHex = "f";
	}	
	return remainderHex;	
}	

System.out.println("Enter the number (hex starts with 0x (zero-x) - no caps pls: ");
String str = System.console().readLine();
if (str.length() > 2 && str.charAt(0) == '0' &&  str.charAt(1) == 'x') {
	String hexInput = str.substring(2,str.length());
	System.out.println("Your hex as dec = " + hexadecimal2decimal(hexInput));
} else {
	int decInput = Integer.parseInt(str);
	System.out.println("Your dec as hex = " + decimal2hexadecimal(decInput));
}	
