import static org.junit.jupiter.api.Assertions.assertEquals;
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
}
