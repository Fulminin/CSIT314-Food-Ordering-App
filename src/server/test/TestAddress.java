import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestAddress {
	public Address con1 = new Address(1, 2520, "Wollongong", "Crown St", 10, 5);
	public Address con2 = new Address(2, 2522, "Keiraville", "University Ave", 2);

	@Test
	public void AddressId(){
		assertEquals(1, con1.getId());
		assertNotEquals(2, con1.getId());
		assertTrue(con1.setId(2));
		assertTrue(con2.setId(1));
		assertEquals(1, con2.getId());
		assertNotEquals(2, con2.getId());
	}

	@Test
	public void PostCode() {
		assertEquals(2520, con1.getPostcode());
		assertNotEquals(2522, con1.getPostcode());
		assertTrue(con1.setPostcode(2522));
		assertTrue(con2.setPostcode(2520));
		assertEquals(2520, con2.getPostcode());
		assertNotEquals(2522, con2.getPostcode());
	}

	@Test 
	public void City(){
		assertEquals("Wollongong", con1.getCity());
		assertNotEquals("Keiraville", con1.getCity());
		assertTrue(con1.setCity("Keiraville"));
		assertTrue(con2.setCity("Wollongong"));
		assertEquals("Wollongong", con2.getCity());
		assertNotEquals("Keiraville", con2.getCity());
	}

	@Test
	public void streetName(){
		assertEquals("Crown St", con1.getStreet());
		assertNotEquals("University Ave", con1.getStreet());
		assertTrue(con1.setStreet("Universiy Ave"));
		assertTrue(con2.setStreet("Crown St"));
		assertEquals("Crown St", con2.getStreet());
		assertNotEquals("University Ave", con2.getStreet());
	}

	@Test
	public void streetNum() {
		assertEquals(10, con1.getStreetNum());
		assertNotEquals(2, con1.getStreetNum());
		assertTrue(con1.setStreetNum(2));
		assertTrue(con2.setStreetNum(10));
		assertEquals(10, con2.getStreetNum());
		assertNotEquals(2, con2.getStreetNum());
	}

	@Test 
	public void UnitNum(){
		assertEquals(5, con1.getUnitNum());
		assertNotEquals(0, con1.getUnitNum());
		assertTrue(con1.setUnitNum(0));
		assertTrue(con2.setUnitNum(5));
		assertEquals(5, con2.getUnitNum());
		assertNotEquals(0, con2.getUnitNum());
	}
}
