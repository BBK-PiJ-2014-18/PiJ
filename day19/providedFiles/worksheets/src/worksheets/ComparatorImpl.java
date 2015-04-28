package worksheets;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<String> {

	public int compare(String o1, String o2) {
		// return a positive number if o1 is longer (etc).
		return o1.length() - o2.length();	
	}
	
}
