public class Comparator {
		
	public <T> T returnMax(T a, T b) {	
		
		String str1 = a.toString();
		String str2 = b.toString();
		
		double c = Double.parseDouble(str1);
		double d = Double.parseDouble(str2);
	
		if (c > d) {
			return a;
		} else {
			return b;
		}	 	
		
	}	
	
}	

/** THIS ALSO WORKS, BUT IS LESS GOOD AS DON'T NEED CLASS TO BE GENERIC, CAN JUST BE IN
*	METHOD AS ABOVE
*	
* 	public class Comparator<T> {
*		
*		public T returnMax(T a, T b) {	
*		
*			String str1 = a.toString();
*			String str2 = b.toString();
*		
*			double c = Double.parseDouble(str1);
*			double d = Double.parseDouble(str2);
*	
*			if (c > d) {
*				return a;
*			} else {
*				return b;
*			}	 	
*		}	
*/	
	