import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestFood {
	// Int String String Double
	public Food con = new Food(1, "Ham", "Made From Pig", 12.99);

	@Test
	public void FoodId() {
		assertEquals(1, con.getId());
		assertNotEquals(2, con.getId());
		assertTrue(con.setId(0));
		assertEquals(0, con.getId());
		assertNotEquals(1, con.getId());
	}

	@Test
	public void Name() {
		assertEquals("Ham", con.getName());
		assertNotEquals("Beef", con.getName());
		assertTrue(con.setName("Beef"));
		assertEquals("Beef", con.getName());
		assertNotEquals("Ham", con.getName());
	}

	@Test
	public void Description() {
		assertEquals("Made From Pig", con.getDescription());
		assertNotEquals("Made From Cow", con.getDescription());
		assertTrue(con.setDescription("Made From Cow"));
		assertEquals("Made From Cow", con.getDescription());
		assertNotEquals("Made From Pig", con.getDescription());
	}

	@Test
	public void Price() {
		assertEquals(12.99, con.getPrice());
		assertNotEquals(0, con.getPrice());
		assertTrue(con.setPrice(10.99));
		assertEquals(10.99, con.getPrice());
		assertNotEquals(12.99, con.getPrice());
	}
}
