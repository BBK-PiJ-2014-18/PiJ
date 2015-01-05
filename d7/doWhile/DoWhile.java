public class DoWhile {

	public static void marks() {
	
		String str;
		int mark;
		int students = 0;
		int distinctions = 0;
		int passes = 0;
		int fails = 0;
		int invalid = -1;
	
		do {
			System.out.print("Input a mark: ");
			str = System.console().readLine();
			mark = Integer.parseInt(str);
			
			if(mark <0 || mark > 100) {
				invalid++;				
			} else {
				students++;							
				if(mark >= 70 && mark <= 100) {
					distinctions++;
				}	 
				if(mark >= 50 && mark <= 69) {
					passes++;
				}
				if(mark >=0 && mark <= 49) {
					fails++;
				}
			}
	
		} while (mark != -1);
		System.out.println("There are " + students + " students: " + distinctions + 
			" distinctions, " + passes + " passes, " + fails + " fails (plus " +
			invalid + " invalid)");	
	}

	public static void main (String[] args) {
		marks();
	}
}