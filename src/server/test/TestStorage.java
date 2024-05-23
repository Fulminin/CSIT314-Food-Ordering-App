import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TestStorage {

	@Test
	public void testSetLogin() {
		Storage testStore = new DataStorage();
		Login[] arrays = {new Login(1,"testUser", "testPass"), new Login(2,"testUser", "testPass")};
		assertTrue(testStore.setLogin(new ArrayList<Login>(Arrays.asList(arrays))));
	}

	@Test
	public void testGetLogin() {
		Storage testStore = new DataStorage();
		ArrayList<Login> data = (ArrayList<Login>)testStore.fetchLogin();
		Login[] arrays = {new Login(1,"testUser", "testPass"), new Login(2,"testUser", "testPass")};
		assertTrue(arrays[0].equals(data.get(0)));
		assertTrue(arrays[1].equals(data.get(1)));

	}

	@Test
	public void testSetUser() {
		Storage testStore = new DataStorage();
		User[] arrays = {new User(1 , 2, "John", "Smith", 20.45, MemberStatus.Normal), new User(2 , 3, "John", "Smith", 32.90, MemberStatus.Member)};
		assertTrue(testStore.setUser(new ArrayList<User>(Arrays.asList(arrays))));
	}

	@Test
	public void testGetUser() {
		Storage testStore = new DataStorage();
		ArrayList<User> data = (ArrayList<User>)testStore.fetchUser();
		User[] arrays = {new User(1 , 2, "John", "Smith", 20.45, MemberStatus.Normal), new User(2 , 3, "John", "Smith", 32.90, MemberStatus.Member)};
		assertTrue(arrays[0].equals(data.get(0)));
		assertTrue(arrays[1].equals(data.get(1)));
	}
	@Test
	public void testSetRest() {
		Storage testStore = new DataStorage();
		Restaraunt[] arrays = {new Restaraunt(1, 4, "Burrito Havan", "A place for Burritos", 163.46, 5.3, 131), new Restaraunt(4, 2, "Pizza Hole", "A hole In the Wall for Pizza", 1034.11, 3.4, 320)};
		assertTrue(testStore.setRestaraunt(new ArrayList<Restaraunt>(Arrays.asList(arrays))));
	}

	@Test
	public void testGetRest() {
		Storage testStore = new DataStorage();
		ArrayList<Restaraunt> data = (ArrayList<Restaraunt>)testStore.fetchRestaraunt();
		Restaraunt[] arrays = {new Restaraunt(1, 4, "Burrito Havan", "A place for Burritos", 163.46, 5.3, 131), new Restaraunt(4, 2, "Pizza Hole", "A hole In the Wall for Pizza", 1034.11, 3.4, 320)};
		assertTrue(arrays[0].equals(data.get(0)));
		assertTrue(arrays[1].equals(data.get(1)));
	}

	@Test
	public void testSetPromo() {
		Storage testStore = new DataStorage();
		Promo[] arrays = {new Promo("CSIT314", 0.10, "2025-12-19", "2030-06-30"), new Promo("Promo1", 0.05, "2023-12-19", "2024-06-30")};
		assertTrue(testStore.setPromo(new ArrayList<Promo>(Arrays.asList(arrays))));
	}

	@Test
	public void testGetPromo() {
		Storage testStore = new DataStorage();
		ArrayList<Promo> data = (ArrayList<Promo>)testStore.fetchPromo();
		Promo[] arrays = {new Promo("CSIT314", 0.10, "2025-12-19", "2030-06-30"), new Promo("Promo1", 0.05, "2023-12-19", "2024-06-30")};
		assertTrue(arrays[0].equals(data.get(0)));
		assertTrue(arrays[1].equals(data.get(1)));
	}

	@Test
	public void retestGetPromo() {
		Storage testStore = new DataStorage();
		Promo[] arrays = {new Promo("CSIT314", 0.10, "2025-12-19", "2030-06-30"), new Promo("Promo1", 0.05, "2023-12-19", "2024-06-30")};
		assertTrue(testStore.setPromo(new ArrayList<Promo>(Arrays.asList(arrays))));
	}

	@Test
	public void retestSetPromo() {
		Storage testStore = new DataStorage();
		ArrayList<Promo> data = (ArrayList<Promo>)testStore.fetchPromo();
		Promo[] arrays = {new Promo("CSIT314", 0.10, "2025-12-19", "2030-06-30"), new Promo("Promo1", 0.05, "2023-12-19", "2024-06-30")};
		assertTrue(arrays[0].equals(data.get(0)));
		assertTrue(arrays[1].equals(data.get(1)));
	}
}
