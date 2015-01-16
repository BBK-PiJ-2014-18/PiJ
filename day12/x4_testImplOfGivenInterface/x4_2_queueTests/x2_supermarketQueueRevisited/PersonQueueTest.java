import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PersonQueueTest {

	PersonQueue pq;

	@Before
	public void setUp() {
//		pq = new SupermarketQueue();
		pq = new TakeNumberQueue();
	}
	
	@Test
	public void testsPushThreePeopleThenPopOne() {
		Person mark = new Person("Mark", 17); 
		Person anna = new Person("Anna", 18); 
		Person ellie = new Person("Ellie", 2); 
		pq.insert(mark);		
		pq.insert(anna);
		pq.insert(ellie);
		assertEquals(mark, pq.retrieve());	
	}

	@Test
	public void testsPushThreePeopleThenPopThree() {
		Person mark = new Person("Mark", 17); 
		Person anna = new Person("Anna", 18); 
		Person ellie = new Person("Ellie", 2); 
		pq.insert(mark);		
		pq.insert(anna);
		pq.insert(ellie);
		assertEquals(mark, pq.retrieve());	
		assertEquals(anna, pq.retrieve());	
		assertEquals(ellie, pq.retrieve());	
	}

// this will fail as not coded for empty queue
	@Test
	public void testsPopFromEmptyQueue() {
		Person mark = new Person("Mark", 17);  
		pq.insert(mark);		
		assertEquals(mark, pq.retrieve());	
		assertNull(pq.retrieve());	
	}

}

