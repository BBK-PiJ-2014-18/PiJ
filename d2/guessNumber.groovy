int numToGuess = Math.abs(1000 * Math.random());
int countGuess = 0;
boolean gotIt = false;

System.out.println "Try to guess my number";


while (!gotIt) {

System.out.println "Tell me a number: ";
String str = System.console().readLine();
int thisGuess = Integer.parseInt(str);

if (thisGuess < numToGuess) {
	System.out.println " No, my number is higher";
	}
	
if (thisGuess > numToGuess) {
	System.out.println " No, my number is lower";
	}

if (thisGuess == numToGuess) {
	System.out.println "CORRECT";
	System.out.println "You needed " + countGuess + " guesses.";
	gotIt = true;
	}

countGuess++;

}	