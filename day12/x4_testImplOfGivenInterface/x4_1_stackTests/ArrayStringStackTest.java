import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ArrayStringStackTest {

	StringStack ss;

	@Before
	public void setUp() {
		ss = new ArrayStringStack();	
	}
	
	@Test
	public void testsPushThreeStringsThenPopOne() {
			ss.push("Mark");
			ss.push("Anna");
			ss.push("Ellie");
			assertEquals("Ellie", ss.pop());	
	}

	@Test
	public void testsPushThreeStringsThenPopTwo() {
			ss.push("Mark");
			ss.push("Anna");
			ss.push("Ellie");
			assertEquals("Ellie", ss.pop());
			assertEquals("Anna", ss.pop());			
	}
	
	@Test
	public void testsPushOneStringsThenPopTop() {
			ss.push("Mark");
			assertEquals("Mark", ss.pop());
	}
	
	@Test
	public void testsPopAnEmptyStack() {
			assertNull(ss.pop());
	}
	
	@Test
	public void testsPushOnePopItThenPopThatEmptyStack() {
			ss.push("Mark");
			assertEquals("Mark", ss.pop());
			assertNull(ss.pop());
	}
	
	@Test
	public void testsPushThreeStringsThenPeekOne() {
			ss.push("Mark");
			ss.push("Anna");
			ss.push("Ellie");
			assertEquals("Ellie", ss.peek());	
	}


	@Test
	public void testsPushThreeStringsThenPeekTwice() {
			ss.push("Mark");
			ss.push("Anna");
			ss.push("Ellie");
			assertEquals("Ellie", ss.peek());
			assertEquals("Ellie", ss.peek());			
	}
	
	@Test
	public void testsPushOneStringsThenPeekTop() {
			ss.push("Mark");
			assertEquals("Mark", ss.peek());
	}
	
	@Test
	public void testsPeekAnEmptyStack() {
			assertNull(ss.peek());
	}

	@Test
	public void testsIsEmptyOnEmptyStack() {
			assertTrue(ss.isEmpty());
	}

	@Test
	public void testsIsEmptyOnNotEmptyStack() {
			ss.push("Mark");
			assertFalse("Not empty stack so isEmpty() should be false", ss.isEmpty());
	}
}

