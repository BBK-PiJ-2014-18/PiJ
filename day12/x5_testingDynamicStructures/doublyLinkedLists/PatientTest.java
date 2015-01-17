import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



public class PatientTest {

	Patient p;

	@Before
	public void setUp() {
		p = new Patient();
	}

	@Test
	public void testEnterTwoTheDeleteOneOfThePatient() {
		Patient mark = new Patient("mark", 17, "spots");
		Patient anna = new Patient("anna", 17, "spots");
		p.addPatient(mark);
		p.addPatient(anna);
		assertTrue(p.deletePatient(mark));
	}

// this test fails....  need to fix the code for the list (way head is done is grim)
	@Test
	public void testEnterTwoTheDeleteBothPatients() {
		Patient mark = new Patient("mark", 17, "spots");
		Patient anna = new Patient("anna", 17, "spots");
		p.addPatient(mark);
		p.addPatient(anna);
		assertTrue(p.deletePatient(mark));
		assertTrue(p.deletePatient(anna));

	}

	@Test
	public void testDeleteAPatientNotInList() {
		Patient mark = new Patient("mark", 17, "spots");
		assertFalse(p.deletePatient(mark));
	}

	@Test
	public void testDeleteAlPatientNoLongerInList() {
		Patient mark = new Patient("mark", 17, "spots");
		Patient anna = new Patient("anna", 17, "spots");
		p.addPatient(mark);
		p.addPatient(anna);
		assertTrue(p.deletePatient(mark));
		assertFalse(p.deletePatient(mark));
	}




}