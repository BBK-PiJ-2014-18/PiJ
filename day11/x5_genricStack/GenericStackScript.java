public class GenericStackScript {

	public static void main (String[] args) {
	
		GenericStackScript gsc = new GenericStackScript();
		gsc.launch();
	}
	
	
	public void launch() {
	
		Node gs1 = new Node();
		gs1.push(1);
		gs1.push(2);
		gs1.push(3);
		gs1.push(4);

		if(!gs1.isEmpty()) {
			System.out.println("pop: " + gs1.pop());
		} else {
			System.out.println("Stack empty");
		}	
		if(!gs1.isEmpty()) {
			System.out.println("pop: " + gs1.pop());
		} else {
			System.out.println("Stack empty");
		}	
		if(!gs1.isEmpty()) {
			System.out.println("pop: " + gs1.pop());
		} else {
			System.out.println("Stack empty");
		}	

		gs1.push(5);
		gs1.push(6);
		
		if(!gs1.isEmpty()) {
			System.out.println("pop: " + gs1.pop());
		} else {
			System.out.println("Stack empty");
		}	
		if(!gs1.isEmpty()) {
			System.out.println("pop: " + gs1.pop());
		} else {
			System.out.println("Stack empty");
		}	
		if(!gs1.isEmpty()) {
			System.out.println("pop: " + gs1.pop());
		} else {
			System.out.println("Stack empty");
		}	
		
		if(!gs1.isEmpty()) {
			System.out.println("pop: " + gs1.pop());
		} else {
			System.out.println("Stack empty");
		}	
		
		gs1.push(7);
		gs1.push(8);
		
		if(!gs1.isEmpty()) {
			System.out.println("pop: " + gs1.pop());
		} else {
			System.out.println("Stack empty");
		}	
		
		
		System.out.println("=== END ===");
	}


}