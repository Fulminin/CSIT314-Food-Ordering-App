import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestRestaraaunt {
	// int restaurantId, int loginId, String name, String description, double credit, double rating, int ratingCount
	Restaraunt testRest = new Restaraunt(1, 4, "Burrito Havan", "A place for Burritos", 163.46, 5.3, 131);

	@Test
	public void testRestaraauntId() {
		assertEquals(1, testRest.getId());
		assertNotEquals(0, testRest.getId());
		assertTrue(testRest.setId(0));
		assertEquals(0, testRest.getId());
		assertNotEquals(1, testRest.getId());
	}

	@Test
	public void testloginId(){
		assertEquals(4, testRest.getLoginId());
		assertNotEquals(1, testRest.getLoginId());
		assertTrue(testRest.setLoginId(1));
		assertEquals(1, testRest.getLoginId());
		assertNotEquals(2, testRest.getLoginId());
	}

	@Test
	public void testName() {
		assertEquals("Burrito Havan", testRest.getName());
		assertNotEquals("Nacho House", testRest.getName());
		assertTrue(testRest.setName("Nacho House"));
		assertEquals("Nacho House", testRest.getName());
		assertNotEquals("Burrito Havan", testRest.getName());
	}

	
	@Test
	public void testDescription() {
		assertEquals("A place for Burritos", testRest.getDescription());
		assertNotEquals("A place for Nachos", testRest.getDescription());
		assertTrue(testRest.setDescription("A place for Nachos"));
		assertEquals("A place for Nachos", testRest.getDescription());
		assertNotEquals("A place for Burritos", testRest.getDescription());
	}

	@Test
	public void testCredit(){
		assertEquals(163.46, testRest.getCredit());
		assertNotEquals(140.54, testRest.getCredit());
		assertTrue(testRest.setCredit(140.54));
		assertEquals(140.54, testRest.getCredit());
		assertNotEquals(163.46, testRest.getCredit());
	}

	@Test
	public void testRating(){
		assertEquals(5.3, testRest.getRating());
		assertNotEquals(6.9, testRest.getRating());
		assertTrue(testRest.setRating(6.9));
		assertEquals(6.9, testRest.getRating());
		assertNotEquals(5.3, testRest.getRating());
	}

	@Test
	public void testRatingCount(){
		assertEquals(131, testRest.getCount());
		assertNotEquals(302, testRest.getCount());
		assertTrue(testRest.setCount(302));
		assertEquals(302, testRest.getCount());
		assertNotEquals(131, testRest.getCount());
	}
}
