import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class HashTest {

	HashUtilities hu;

	@Before
	public void setUp() {
		hu = new HashUtilities();	
	}
	
	@Test
	public void testsInRange() {
//		HashUtilities hu = new HashUtilities();
		for (int i = 0; i < 20000; i ++) {		
			int input = (int) (Math.random() * 1000000000);
			int output = hu.shortHash(input);
			boolean expected = (output >= 0 && output <= 999);
			assertTrue("out of range", expected);
		}
	}

	@Test
	public void testsOneCorrectNumber() {
//		HashUtilities hu = new HashUtilities();
		int input = 7500005;
		int output = hu.shortHash(input);
		int expected = 5;
		assertEquals(expected, output);
	}	
	
	@Test
	public void testsZero() {
//		HashUtilities hu = new HashUtilities();
		int input = 0;
		int output = hu.shortHash(input);
		int expected = 0;
		assertEquals(expected, output);
	}	
	
	@Test
	public void testsThousand() {
//		HashUtilities hu = new HashUtilities();
		int input = 1000;
		int output = hu.shortHash(input);
		int expected = 0;
		assertEquals(expected, output);
	}	
	
	@Test
	public void tests999() {
//		HashUtilities hu = new HashUtilities();
		int input = 1999;
		int output = hu.shortHash(input);
		int expected = 999;
		assertEquals(expected, output);
	}	
	
// and can shorten to... and give a full sentence as the name

	@Test
	public void tests999TheTopBoundryWorksOK() {
		assertEquals(999,hu.shortHash(1999));
	}	

}

