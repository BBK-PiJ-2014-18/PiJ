package mondayLab;

import java.util.Arrays;
import java.util.List;

public class Towns {	
	
	static boolean foundTown(List<String> towns, String town) {
		boolean found = false;
		for(String t: towns) {
			if(t.equals(town)) {
				found = true;
				break;
			}
		}
		return found;
	}
	
	public static void main (String[] args) {
		List<String> towns = Arrays.asList("Chelmsford", "Canterbury");
		
		System.out.println(towns);
		
		
		
		System.out.println(foundTown(towns, "Exeter"));
		System.out.println(towns.contains("Canterbury"));
	}
}





