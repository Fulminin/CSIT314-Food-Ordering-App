import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestPromo {
	// String promoCode, double discount, String startDate, String endDate
	Promo con = new Promo("Promo1", 0.05, "2023-12-19", "2024-06-30");

	@Test
	public void testPromoCode() {
		assertEquals("Promo1", con.getPromoCode());
		assertNotEquals("promo1", con.getPromoCode());
		assertTrue(con.setPromoCode("CSIT314"));
		assertEquals("CSIT314", con.getPromoCode());
		assertNotEquals("Promo1", con.getPromoCode());
	}

	@Test
	public void testDiscount() {
		assertEquals(0.05, con.getDiscount());
		assertNotEquals(0.10, con.getDiscount());
		assertTrue(con.setDiscount(0.10));
		assertEquals(0.10, con.getDiscount());
		assertNotEquals(0.05, con.getDiscount());
	}

	@Test
	public void testStartDate() {
		assertEquals("2023-12-19", con.getStartDate());
		assertNotEquals("2019-12-23", con.getStartDate());
		assertTrue(con.setStartDate("2019-12-23"));
		assertEquals("2019-12-23", con.getStartDate());
		assertNotEquals("2023-12-19", con.getStartDate());
	}

	@Test
	public void testEndDate() {
		assertEquals("2024-06-30", con.getEndDate());
		assertNotEquals("2030-06-24", con.getEndDate());
		assertTrue(con.setEndDate("2030-06-24"));
		assertEquals("2030-06-24", con.getEndDate());
		assertNotEquals("2024-06-30", con.getEndDate());
	}
	
}
