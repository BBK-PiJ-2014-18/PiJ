import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class UserImplTest {

	@Test
	public void testConstructorAndGetterForName() {
		User u = new UserImpl("Anna");
		assertEquals("Anna", u.getName());
	}

	@Test
	public void testGetterForIDBeforeIDSet() {
		User u = new UserImpl("Anna");
		assertEquals(0, u.getID());
		}

	@Test
	public void testGetterForIDAfterIDSet() {
		User u = new UserImpl("Anna");
		u.setID(11);
		assertEquals(11, u.getID());
	}
}	