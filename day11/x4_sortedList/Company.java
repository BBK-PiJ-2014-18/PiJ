public class Company  {

	public static void main (String[] args) {
		Company co = new Company();
		co.launch();	
	} 

	public void launch() {
		EmpItem<String> empNames = new SortedEmpItem<String>("eee");
		empNames.add("bbb");
		empNames.add("xxx");
		empNames.add("aaa");
		empNames.add("ddd");
		empNames.add("ccc");
		empNames.add("yyy");
		empNames.add("zzz");
		System.out.println();
		System.out.println("=== PRINTING FORWARDS ===");
		empNames.printForwards();
		System.out.println();
		System.out.println("=== PRINTING BACKWARDS ===");
		empNames.printBackwards();
	
		EmpItem<Integer> empNums = new SortedEmpItem<Integer>(1);
		empNums.add(2);
		empNums.add(3);
		empNums.add(4);
		System.out.println();
		System.out.println("=== PRINTING FORWARDS ===");
		empNums.printForwards();
		System.out.println();
		System.out.println("=== PRINTING BACKWARDS ===");
		empNums.printBackwards();
		
		System.out.println();
/*		System.out.println("!!!      DELETE ANNA/2     !!!");
		empNames.delete("Anna");
		empNums.delete(2);

		System.out.println();
		System.out.println("=== PRINTING FORWARDS ===");
		empNames.printForwards();
		System.out.println();
		System.out.println("=== PRINTING BACKWARDS ===");
		empNames.printBackwards();
		System.out.println();
		System.out.println("=== PRINTING FORWARDS ===");
		empNums.printForwards();
		System.out.println();
		System.out.println("=== PRINTING BACKWARDS ===");
		empNums.printBackwards();
		
*/		
		System.out.println();
	}

}