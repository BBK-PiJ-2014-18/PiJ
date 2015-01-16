import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {
	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}

@Test
	public void testsOneExtraSpaceMiddleName() {
		Person p = new Person();
		String input = "Dereck  Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}

@Test
	public void testsManyExtraSpaceMiddleName() {
		Person p = new Person();
		String input = "Dereck         Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}

@Test
	public void testsExtraSpaceAtFrontName() {
		Person p = new Person();
		String input = " Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}


// there are no errors when there are extra spaces at the end



}