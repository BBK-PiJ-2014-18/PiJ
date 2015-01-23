import java.util.List;
import java.util.ArrayList;

public class MergeSort {

	private int length;

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		ms.launch();
	}	

	public void launch() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <10; i++) {
			list.add((int) Math.abs(10000 * Math.random()));
		}
		printList(list);
		System.out.println("=> => =>");
		list = sort(list);
		printList(list);
	}
	
	public List<Integer> sort(List list) {
		if (list.size() <= 1) {
			return list;
		}	
		//split array in half
		List<Integer> front = new ArrayList<Integer>();
		List<Integer> back = new ArrayList<Integer>();
		for (int i = 0; i < list.size()/2; i++) {
			int z = (int) list.get(i);
			front.add(z);
		}	
		for (int i = list.size()/2; i < list.size(); i++) {
			int z = (int) list.get(i);
			back.add(z);
		}
		//sort each half		
		sort(front);
		sort(back);
		//integration
		int fc = 0;
		int bc = 0;
		int j = 0;
		while(fc < front.size() && bc < back.size()) {
			if(front.get(fc) < back.get(bc)) {
				int z = (int) front.get(fc);
				list.set(j,z);			
				fc++;
			} else {
				int z = (int) back.get(bc);
				list.set(j,z);
				bc++;
			}			
			j++;
		}
		for (int i = fc ; i < front.size(); i++) {
				int z = (int) front.get(i);
				list.set(j, z);
				j++;
		}
		for (int i = bc ; i < back.size(); i++) {
				int z = (int) back.get(i);
				list.set(j,z);
				j++;				
		}
		return list;
	}
	
	public void printList(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get((i)) + " < ");
		}	
		System.out.println();		
	}
}