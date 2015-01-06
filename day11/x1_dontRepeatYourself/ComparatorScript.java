public class ComparatorScript {

	public static void main (String[] args) {
		ComparatorScript cs = new ComparatorScript();
		cs.launch();
	}
	
	public void launch() {
		
		Comparator comp = new Comparator();
		System.out.println(comp.returnMax(5,6));
		System.out.println(comp.returnMax("50","60"));
		System.out.println(comp.returnMax(1.2,1.3));
		
	}		
}