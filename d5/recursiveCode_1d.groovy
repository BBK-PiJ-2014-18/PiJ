
int m(int n) {
	if(n > 100) {
		return n - 10;
	} else {
		return m(m(n+11));		
	}
}
//System.out.println(mC(50));


// now replicating with loops

int getInt (String str) {
	String numStr = "";
	for (i = 0; i < str.length() ; i++) {
		if (str.charAt(i) != "X")	{
			numStr = numStr + str.charAt(i);
		}		
	}
	return Integer.parseInt(numStr);
}	
	
int countTheMs (String str) {
	int countM = 0;
	for (i = 0; i < str.length() ; i++) {
		if (str.charAt(i) == "X")	{
			countM++;
		}
	}
	return countM;	
}	

String changeStr (String strToChange) {
	int x = getInt(strToChange);
	if(x > 100) {
		x= x - 10;
		String strX = Integer.toString(x);
		int countM = countTheMs(strToChange);
		String strToReturn = "";
			for (i=1; i <= countM - 1 ; i++) {
				strToReturn = strToReturn + "X";
			}	
		strToReturn = strToReturn + strX;		
		return strToReturn;		
	} else {
		x = x + 11;
		String strX = Integer.toString(x);
		int countM = countTheMs(strToChange);
		String strToReturn = "";
			for (i=1; i <= countM ; i++) {
				strToReturn = strToReturn + "X";
			}	
		strToReturn = strToReturn + "X" + strX;
		return strToReturn;
	}
}

boolean done = false;
String magic = "X50";
String newMagic;
int count = 0;
while (!done) {
	newMagic = changeStr(magic);
	System.out.println(newMagic);
	magic = newMagic;
	if (magic.charAt(0) != "X") {
		break;
	}	
}



	





