int value[];
String suit[];

String str = "";
int count = 0;
boolean done = false;
while (count < 5) {

	System.out.println ("Enter card value (1,2, ... , 9, 10, J, Q, K): ");	
	str = System.console().readLine();
	
	if (str ==  "J") {
		value[count] = 11;
		done = true;
		}
	if (str ==  "Q") {
		value[count] = 12;
		done = true;
		}
	if (str ==  "K") {
		value[count] = 13;
		done = true;
		}
		
	if (!done) {
	
	
		value[count]  = Integer.parseInt(str);

	}

	System.out.println ("U added: " + value[count]);	

	





	count++;


}





System.out.println ("the end...");
