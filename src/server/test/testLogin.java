import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class testLogin {
	Login test = new Login(1,"testUser", "testPass");
	Login testCon1 = new Login("testUser", "testPass");

	@Test
	public void conTest1() {
		assertEquals("testUser", testCon1.getUsername());
		assertEquals("testPass", testCon1.getPassword());
		assertEquals(testCon1.getNumber(), testCon1.getLoginID());
	}

	@Test
	public void conFailTest1() {
		assertNotEquals(2, testCon1.getLoginID());
		assertNotEquals("notUser", testCon1.getUsername());
		assertNotEquals("notPass", testCon1.getPassword());
	}

	@Test
	public void conTest2() {
		assertEquals("testUser", test.getUsername());
		assertEquals("testPass", test.getPassword());
		assertEquals(1, test.getLoginID());
	}

	@Test
	public void conFailTest2() {
		assertNotEquals(2, test.getLoginID());
		assertNotEquals("notUser", test.getUsername());
		assertNotEquals("notPass", test.getPassword());
	}

	@Test
	public void testLog() {
		assertEquals(1, test.getLoginID());
	}

	@Test
	public void testUsername() {
		assertEquals("testUser", test.getUsername());
	}

	@Test
	public void testPass() {
		assertEquals("testPass", test.getPassword());
	}

	@Test
	public void testFalseLogID() {
		assertNotEquals(2, test.getLoginID());
	}

	
	@Test
	public void testFalseUser() {
		assertNotEquals("notUser", test.getUsername());
	}

	@Test
	public void testFalsePass() {
		assertNotEquals("notPass", test.getPassword());
	}
	
	@Test
	public void testLog2() {
		test.setLoginID(2);
		assertEquals(2, test.getLoginID());
	}
	
	@Test
	public void testUser2() {
		test.setUsername("newUser");
		assertEquals("newUser", test.getUsername());
	}
	
	@Test
	public void testPass2() {
		test.setPassword("newPass");
		assertEquals("newPass", test.getPassword());
	}

	@Test
	public void testFailLog2() {
		test.setLoginID(1);
		assertNotEquals(2, test.getLoginID());
	}

	@Test
	public void testFailUser2() {
		test.setUsername("newUser");
		assertNotEquals("notUser", test.getUsername());
	}
	
	@Test
	public void testFailPass2() {
		test.setPassword("newPass");
		assertNotEquals("notPass", test.getPassword());
	}

}
