import java.util.ArrayList;
import java.util.Arrays;

public class Restaraunt {
	private int restaurantId;
	private int loginId;
	private String name;
	private String description;
	private double credit;
	private double rating;
	private int ratingCount;

// The Hell am I going to do these
	private ArrayList<Address> address;
	private ArrayList<String> tags;
	private ArrayList<Food> menu;
	private ArrayList<Order> orders;

	public Restaraunt(int restaurantId, int loginId, String name, String description, double credit, double rating, int ratingCount){
		this.restaurantId = restaurantId;
		this.loginId = loginId;
		this.name = name;
		this.description = description;
		this.credit = credit;
		this.rating = rating;
		this.ratingCount = ratingCount;

		this.address = new ArrayList<Address>();
		this.tags = new ArrayList<String>();
		this.menu = new ArrayList<Food>();
		this.orders = new ArrayList<Order>();
	}

	// restarauntId
	public int getId() {
		return restaurantId;
	}

	public boolean setId(int id) {
		this.restaurantId = id;
		return true;
	}

	// login Id
	public int getLoginId() {
		return loginId;
	}

	public boolean setLoginId(int input){
		this.loginId = input;
		return true;
	}

	// name
	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		this.name = name;
		return true;
	}

	// description
	public String getDescription() {
		return description;
	}

	public boolean setDescription(String description) {
		this.description = description;
		return true;
	}
	// credit
	public double getCredit() {
		return credit;
	}

	public boolean setCredit(double credit) {
		this.credit = credit;
		return true;
	}

	// rating
	public double getRating() {
		return rating;
	}

	public boolean setRating(double rating) {
		this.rating = rating;
		return true;
	}
	// ratingcount
	public int getCount() {
		return ratingCount;
	}

	public boolean setCount(int ratingCount) {
		this.ratingCount = ratingCount;
		return true;
	}
	// Address
	public boolean addAddress(Address input) {
		address.add(input);
		return true;
	}

	public boolean removeAddress(int select) {
		address.remove(select);
		return true;
	}

	public boolean addAddressList(Address[] list) {
		address.addAll(Arrays.asList(list));
		return true;
	}

	public boolean addAddressList(ArrayList<Address> list) {
		address.addAll(list);
		return true;
	}

	public Address getAddress(int pos) {
		return address.get(pos);
	}

	public ArrayList<Address> getAddressList(){
		return address;
	}
	// tags
	public boolean addTag(String tag) {
		tags.add(tag);
		return true;
	}

	public boolean removeTag(String select) {
		tags.remove(select);
		return true;
	}

	public boolean addTagList(String[] list) {
		tags.addAll(Arrays.asList(list));
		return true;
	}

	public boolean addTagList(ArrayList<String> list) {
		tags.addAll(list);
		return true;
	}

	public String getTag(int i) {
		return tags.get(i);
	}

	public ArrayList<String> getTagList() {
		return tags;
	}

	// menu
	public boolean addFood(Food input) {
		menu.add(input);
		return true;
	}

	public boolean removeFood(int pos) {
		menu.remove(pos);
		return true;
	}

	public boolean addFoodList(Food[] list) {
		menu.addAll(Arrays.asList(list));
		return true;
	}

	public boolean addFoodList(ArrayList<Food> list) {
		menu.addAll(list);
		return true;
	}

	public Food getFood(int i) {
		return menu.get(i);
	}

	public ArrayList<Food> getFoodList() {
		return menu;
	}

	// orders
	public boolean addOrder(Order input) {
		orders.add(input);
		return true;
	}

	public boolean removeOrder(int pos) {
		orders.remove(pos);
		return true;
	}

	public boolean addOrderList(Order[] input) {
		orders.addAll(Arrays.asList(input));
		return true;
	}

	public boolean addOrderList(ArrayList<Order> input) {
		orders.addAll(input);
		return true;
	}

	public Order getOrder(int i) {
		return orders.get(i);
	}

	public ArrayList<Order> getOrderList() {
		return orders;
	}
}
