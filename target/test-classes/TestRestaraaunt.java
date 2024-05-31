import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

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

	@Test
	public void testAddress(){
		Restaraunt restList = new Restaraunt(4, 2, "Pizza Hole", "A hole In the Wall for Pizza", 1034.11, 3.4, 320);
		Address[] lisAddr = {new Address(1, 2520, "Wollongong", "Crown St", 10, 5), new Address(2, 2522, "Keiraville", "University Ave", 2), new Address(1, 2520, "Wollongong", "Keira St", 20, 100)};
		ArrayList<Address> addr = new ArrayList<Address>();
		addr.addAll(Arrays.asList(lisAddr));
		assertTrue(restList.addAddressList(lisAddr));
		assertEquals(addr, restList.getAddressList());
		
		Restaraunt restList2 = new Restaraunt(4, 2, "Burget Cave", "Burger place", 2134.12, 5.0, 3);
		assertTrue(restList2.addAddressList(addr));
		assertEquals(addr, restList2.getAddressList());

		assertEquals(lisAddr[0], restList.getAddress(0));
		assertNotEquals(lisAddr[1], restList.getAddress(0));
		assertTrue(restList2.removeAddress(1));
		assertTrue(restList2.addAddress(new Address(2, 2522, "Keiraville", "University Ave", 2)));
	}

	@Test
	public void testTagList(){
		Restaraunt restList = new Restaraunt(4, 2, "Pizza Hole", "A hole In the Wall for Pizza", 1034.11, 3.4, 320);
		String[] lisTags = {"Round", "Pizza", "Cheese", "Meat", "Vegan"};
		ArrayList<String> lis = new ArrayList<String>();
		lis.addAll(Arrays.asList(lisTags));
		assertTrue(restList.addTagList(lisTags));
		assertEquals(lis, restList.getTagList());
		
		Restaraunt restList2 = new Restaraunt(4, 2, "Burget Cave", "Burger place", 2134.12, 5.0, 3);
		assertTrue(restList2.addTagList(lis));
		assertEquals(lis, restList2.getTagList());

		assertEquals(lisTags[0], restList.getTag(0));
		assertNotEquals(lisTags[1], restList.getTag(0));
		assertTrue(restList2.removeTag("Vegan"));
		assertTrue(restList2.addTag("Carnivoure"));
	}

	@Test
	public void testFoodList(){
		Restaraunt restList = new Restaraunt(4, 2, "Pizza Hole", "A hole In the Wall for Pizza", 1034.11, 3.4, 320);
		Food[] listFood = {new Food(1, "Ham", "Made From Pig", 12.99), new Food(2, "Beef", "Made From Cow", 16.00)};
		ArrayList<Food> lis = new ArrayList<Food>();
		lis.addAll(Arrays.asList(listFood));
		assertTrue(restList.addFoodList(listFood));
		assertEquals(lis, restList.getFoodList());
		
		Restaraunt restList2 = new Restaraunt(4, 2, "Burget Cave", "Burger place", 2134.12, 5.0, 3);
		assertTrue(restList2.addFoodList(lis));
		assertEquals(lis, restList2.getFoodList());

		assertEquals(listFood[0], restList.getFood(0));
		assertNotEquals(listFood[1], restList.getFood(0));
		assertTrue(restList2.removeFood(1));
		assertTrue(restList2.addFood(new Food(1, "Ham", "Made From Pig", 12.99)));
	}

	@Test
	public void testOrderList(){
		Restaraunt restList = new Restaraunt(4, 2, "Pizza Hole", "A hole In the Wall for Pizza", 1034.11, 3.4, 320);
		Order[] listOrder = {new Order(3, 1, 2, "2024-05-19", OrderStatus.delivered, "Promo1"), new Order(2, 3, "2023-12-31", OrderStatus.cart, "none")};
		ArrayList<Order> lis = new ArrayList<Order>();
		lis.addAll(Arrays.asList(listOrder));
		assertTrue(restList.addOrderList(listOrder));
		assertEquals(lis, restList.getOrderList());
		
		Restaraunt restList2 = new Restaraunt(4, 2, "Burget Cave", "Burger place", 2134.12, 5.0, 3);
		assertTrue(restList2.addOrderList(lis));
		assertEquals(lis, restList2.getOrderList());

		assertEquals(listOrder[0], restList.getOrder(0));
		assertNotEquals(listOrder[1], restList.getOrder(0));
		assertTrue(restList2.removeOrder(1));
		assertTrue(restList2.addOrder(new Order(3, 1, 2, "2024-05-19", OrderStatus.delivered, "Promo1")));
	}
}
