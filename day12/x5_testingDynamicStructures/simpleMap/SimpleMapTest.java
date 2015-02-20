import org.junit.Test;
import org.junit.Before;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SimpleMapTest {

	private SimpleMap sm;
	private int m;
	private int e;

	@Before
	public void setUp() {
		sm = new SimpleMapImpl();
		m = ("mark").hashCode();
		m = HashUtilities.shortHash(m);
		e = ("ellie").hashCode();
		e = HashUtilities.shortHash(e);
		sm.put(m, "mark");
		sm.put(e, "ellie");
	}	

	@Test 
	public void testGetNameThatHasBeenPut() {
		assertEquals("mark", sm.get(m));
	}

	@Test 
	public void testPutNameOnKeyThatAlreadyHasNameAccoc() {
		sm.put(m,"turbo");
		assertEquals("mark", sm.get(m));
	}

	@Test 
	public void testGetWhenNoNameAssocWithKeyReturnsNull() {
		assertNull(sm.get(7));
	}

	@Test
	public void testRemoveName() {
		sm.remove(m);
		assertNull(sm.get(m));
	}		
	
	@Test
	public void testRemoveNameAndThenPutNameToKey() {
		sm.remove(m);
		sm.put(m, "monkey");
		assertEquals("monkey", sm.get(m));
	}		
	
	@Test
	public void testIsEmptyWhenNotEmpty() {
		assertFalse(sm.isEmpty());
	}
	
	@Test
	public void testIsEmptyWhenEmpty() {
		sm.remove(m);
		sm.remove(e);
		assertTrue(sm.isEmpty());
	}

}















