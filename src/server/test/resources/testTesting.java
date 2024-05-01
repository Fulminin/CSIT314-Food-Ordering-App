import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class testTesting {
	Testing test = new Testing();

	@Test
	public void add1() {
		assertSame(2, test.add1(1));
	}

	@Test 
	public void add2() {
		assertSame(3, test.add2(1));
	}
}
