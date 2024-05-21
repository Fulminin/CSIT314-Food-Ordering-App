import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestOrder {
	// int orderId, int restarauntId, int userId, Date orderDate, OrderStatus status, String promoCode
	public Order con1 = new Order(3, 1, 2, "2024-05-19", OrderStatus.delivered, "Promo1");
	// int restarauntId, int userId, Date orderDate, OrderStatus status, String promoCode
	public Order con2 = new Order(2, 3, "2023-12-31", OrderStatus.cart, "none");

	@Test
	public void testOrderId() {
		assertEquals(3, con1.getOrderId());
		assertNotEquals(0, con1.getOrderId());
		assertNotEquals(0, con2.getOrderId());
		assertEquals(4, con2.getOrderId());
		assertTrue(con1.setOrderId(2));
		assertEquals(2, con1.getOrderId());
		assertNotEquals(3, con2.getOrderId());
	}

	@Test
	public void testRestarauntId(){
		assertEquals(1, con1.getRestaurantId());
		assertEquals(2, con2.getRestaurantId());
		assertNotEquals(2, con1.getRestaurantId());
		assertNotEquals(1, con2.getRestaurantId());
		assertTrue(con1.setRestaurantId(2));
		assertTrue(con2.setRestaurantId(1));
		assertEquals(2, con1.getRestaurantId());
		assertEquals(1, con2.getRestaurantId());
		assertNotEquals(1, con1.getRestaurantId());
		assertNotEquals(2, con2.getRestaurantId());
	}

	@Test
	public void testUserId() {
		assertEquals(2, con1.getUserId());
		assertEquals(3, con2.getUserId());
		assertNotEquals(3, con1.getUserId());
		assertNotEquals(2, con2.getUserId());
		assertTrue(con1.setUserId(3));
		assertTrue(con2.setUserId(2));
		assertEquals(3, con1.getUserId());
		assertEquals(2, con2.getUserId());
		assertNotEquals(2, con1.getUserId());
		assertNotEquals(3, con2.getUserId());
	}

	@Test
	public void testOrderDate() {
		assertEquals("2024-05-19", con1.getDate());
		assertEquals("2023-12-31", con2.getDate());
		assertNotEquals("2023-12-31", con1.getDate());
		assertNotEquals("2024-05-19", con2.getDate());
		assertTrue(con1.setDate("2023-12-31"));
		assertTrue(con2.setDate("2024-05-19"));
		assertEquals("2023-12-31", con1.getDate());
		assertEquals("2024-05-19", con2.getDate());
		assertNotEquals("2024-05-19", con1.getDate());
		assertNotEquals("2023-12-31", con2.getDate());
	}

	@Test
	public void testOrderStatus() {
		assertEquals(OrderStatus.delivered, con1.getProgress());
		assertEquals(OrderStatus.cart, con2.getProgress());
		assertNotEquals(OrderStatus.paid, con1.getProgress());
		assertNotEquals(OrderStatus.delivered, con2.getProgress());
		assertTrue(con1.setProgress(OrderStatus.paid));
		assertTrue(con2.setProgress(OrderStatus.shipped));
		assertEquals(OrderStatus.paid, con1.getProgress());
		assertEquals(OrderStatus.shipped, con2.getProgress());
		assertNotEquals(OrderStatus.delivered, con1.getProgress());
		assertNotEquals(OrderStatus.cart, con2.getProgress());
	}

	@Test
	public void testPromoCode() {
		assertEquals("Promo1", con1.getPromoCode());
		assertEquals("none", con2.getPromoCode());
		assertNotEquals("none", con1.getPromoCode());
		assertNotEquals("Promo1", con2.getPromoCode());
		assertTrue(con1.setPromoCode("none"));
		assertTrue(con2.setPromoCode("Promo1"));
		assertEquals("none", con1.getPromoCode());
		assertEquals("Promo1", con2.getPromoCode());
		assertNotEquals("Promo1", con1.getPromoCode());
		assertNotEquals("none", con2.getPromoCode());
	}
}
