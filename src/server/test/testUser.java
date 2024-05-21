import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class testUser {
	// int userId, int loginId, String firstName, String lastName, double credit, MemberStatus memberStatus
	public User con = new User(1 , 2, "John", "Smith", 20.45, MemberStatus.Normal);

	@Test
	public void testUserId(){
		assertEquals(1, con.getId());
		assertNotEquals(0, con.getId());
		assertTrue(con.setId(0));
		assertEquals(0, con.getId());
		assertNotEquals(1, con.getId());
	}

	@Test
	public void testloginId(){
		assertEquals(2, con.getLoginId());
		assertNotEquals(1, con.getLoginId());
		assertTrue(con.setLoginId(1));
		assertEquals(1, con.getLoginId());
		assertNotEquals(2, con.getLoginId());
	}

	@Test
	public void testFirstName(){
		assertEquals("John", con.getFirstname());
		assertNotEquals("Jack", con.getFirstname());
		assertTrue(con.setFirstName("Jack"));
		assertEquals("Jack", con.getFirstname());
		assertNotEquals("John", con.getFirstname());
	}

	@Test
	public void testLastName(){
		assertEquals("Smith", con.getLastName());
		assertNotEquals("Barr", con.getLastName());
		assertTrue(con.setLastName("Barr"));
		assertEquals("Barr", con.getLastName());
		assertNotEquals("Smith", con.getLastName());
	}

	@Test
	public void testCredit(){
		assertEquals(20.45, con.getCredit());
		assertNotEquals(40.54, con.getCredit());
		assertTrue(con.setCredit(40.54));
		assertEquals(40.54, con.getCredit());
		assertNotEquals(20.45, con.getCredit());
	}

	@Test
	public void testMemberStatus(){
		assertEquals(MemberStatus.Normal, con.getMemberStatus());
		assertNotEquals(MemberStatus.Member, con.getMemberStatus());
		assertTrue(con.setMemberStatus(MemberStatus.Member));
		assertEquals(MemberStatus.Member, con.getMemberStatus());
		assertNotEquals(MemberStatus.Normal, con.getMemberStatus());
	}

	@Test
	public void testAddress(){
		// Address(int addressId, int postcode, String city, String streetName, int streetNum, int unitNum)
		assertTrue(con.addAddress(new Address(1, 2520, "Wollongong", "Crown St", 10, 5)));
		assertEquals(new Address(1, 2520, "Wollongong", "Crown St", 10, 5), con.getAddress(0));
		assertNotEquals(new Address(2, 2522, "Keiraville", "University Ave", 2), con.getAddress(0));
		assertTrue(con.addAddress(new Address(2, 2522, "Keiraville", "University Ave", 2)));
		assertTrue(con.removeAddress(1));
	}
}
