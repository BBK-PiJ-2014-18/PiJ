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
		
		
		/*THIS ALSO WORKS
		Comparator<String> compS = new Comparator<String>();
		System.out.println(compS.returnMax("100", "200"));

		Comparator<Double> compD = new Comparator<Double>();
		System.out.println(compD.returnMax(100.5, 200.5));

		Comparator<Integer> compI = new Comparator<Integer>();
		System.out.println(compI.returnMax(1, 2));	
		*/
	}


}