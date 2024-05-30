import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestOrderedFood {
	// int foodId, int orderId, int quanitiy
	public OrderedFood con = new OrderedFood(3, 2, 1);

	@Test
	public void testFoodId() {
		assertEquals(3, con.getFoodId());
		assertNotEquals(2, con.getFoodId());
	}

	@Test
	public void testOrderId() {
		assertEquals(2, con.getOrderId());
		assertNotEquals(1, con.getOrderId());
	}

	@Test
	public void testQuantity() {
		assertEquals(1, con.getQty());
		assertNotEquals(2, con.getQty());
		assertTrue(con.changeQty(2));
		assertEquals(2, con.getQty());
		assertNotEquals(1, con.getQty());
	}

	@Test
	public void testEquals() {
		assertTrue(con.equals(new OrderedFood(3, 2, 1)));
		assertFalse(con.equals(new OrderedFood(3, 2, 2)));
		assertTrue(con.equals(con));
		assertFalse(con.equals(null));
		assertFalse(con.equals("This is not Food"));
		assertFalse(con.equals(new OrderedFood(2, 2, 1)));
		assertFalse(con.equals(new OrderedFood(3, 3, 1)));
		assertFalse(con.equals(new OrderedFood(3, 2, 2)));
	}
}
