import java.util.ArrayList;

public interface Storage {
	// fetch login
	public ArrayList<Login> fetchLogin();
	// fetch user
	public ArrayList<User> fetchUser();
	// fetch restaraunt
	public ArrayList<Restaraunt> fetchRestaraunt();
	// fetch promo
	public ArrayList<Promo> fetchPromo();
	// set login
	public boolean setLogin(ArrayList<Login> newLogin);
	// set user
	public boolean setUser(ArrayList<User> newUser);
	// set restaurant
	public boolean setRestaraunt(ArrayList<Restaraunt> newRestaraunt);
	// set promo
	public boolean setPromo(ArrayList<Promo> newPromo);

}
