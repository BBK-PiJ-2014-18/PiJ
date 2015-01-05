public class TestStack {

	private Node stackStart = new Node();

	public static void main (String[] args) {
		TestStack myStack = new TestStack();	
		myStack.launch();
	}

	private void launch() {
		// push 5...		
		Node firstPush = new Node(5);
		stackStart.push(firstPush);
		// push 8...		
		Node bPush = new Node(8);
		stackStart.push(bPush);
		// push 12...		
		Node cPush = new Node(12);
		stackStart.push(cPush);
		// pop (and get... 12)
		stackStart.pop();
		// push 13
		Node dPush = new Node(13);
		stackStart.push(dPush);
		// pop (and get... 13)
		stackStart.pop();
		// pop (and get... 8)	
		stackStart.pop();
		// pop (and get... 5)
		stackStart.pop();
		// pop (and get... Stack Empty)
		stackStart.pop(); 


//extra checking 
/*		
	
		// pop (and get... Stack Empty)
		stackStart.pop(); 
		// put two 8s on
		Node ePush = new Node(8);
		stackStart.push(ePush);
		Node fPush = new Node(8);
		stackStart.push(fPush);
		//pop one 8
		stackStart.pop(); 
		// put two 13s on
		Node gPush = new Node(13);
		stackStart.push(gPush);
		Node hPush = new Node(13);
		stackStart.push(hPush);
		// pop the last 8
		stackStart.pop(); 
		//and then the last 2 13s and get a final two empty
		stackStart.pop(); 		
		stackStart.pop(); 		
		stackStart.pop(); 
		stackStart.pop(); 
*/
	}
}