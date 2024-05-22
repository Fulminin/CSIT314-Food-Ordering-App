import java.util.ArrayList;


// A word of warning I used "" (empty Strings to indicate unknown) and 2000-01-01 to indicate Unknown date
public class Model {
	private ArrayList<Login> logins;
	private ArrayList<User> users;
	private ArrayList<Restaraunt> restaraunts;
	private ArrayList<Promo> promos;
	private ArrayList<Order> orders;
	private Communication comms;
	private Storage store;
	private boolean runningLikeAChamp = false;
	
	public static void main(String[] args){
		Model mainProgram = new Model();
		mainProgram.readAllFromStorage(); // this should only ever be run once; although i don't think it would cause muc hof an issue
		mainProgram.mainLoop();
		mainProgram.writeAllToStorage();
	}

	public Model() {
		store = new DataStorage();
	}

	// Put Stuff in here to run
	public void mainLoop(){
		runningLikeAChamp = true;
		while (runningLikeAChamp){ // for shut down we need to set Running Like a champ to false

		}

	}
	// not sure if actually needed but made thses if we need to connect or disconnect from stuff
	public boolean connect() {
		return false;
	}

	public boolean disconnect() {
		return false;
	}

	// checking to see if there is anything waiting to add to the datamodel
	public void checkCommunications() {

	}

	public void checkLogins(){

	}

	public void checkUsers() {

	}

	public void checkRestaraunts() {

	}

	public void checkOrders() {
		
	}
	// loading all data from persistant storage
	public void writeAllToStorage() {
		writeLogins();
		writeUsers();
		writeRestaraunt();
		writePromo();
		writeLogins();

	}

	// getting all data from the persistant stoarage
	public void readAllFromStorage(){
		fetchLogins();
		fetchUser();
		fetchRestaraunt();
		fetchPromo();
		fetchOrder();
	}

	public int calculateDistance(Restaraunt rest, User use) {
		return -1;
	}

	// Getting from the Array Lists and getting from array lists
	public Login getLogin(int id) {
		for (Login u : logins){
			if(u.getLoginID() == id){
				return u;
			}
		}
		return new Login("", ""); // Blank Login to stopp null reference
	}

	public boolean addLogin(Login input) {
		logins.add(input);
		return true;
	}

	public User getUser(int id) {
		for (User u : users){
			if(u.getId() == id){
				return u;
			}
		}
		return new User(id, 0, "", "", 0.0, MemberStatus.Normal); // Blank User to stop null reference
	}

	public boolean addUser(User input) {
		users.add(input);
		return true;
	}

	public Restaraunt getRestaraunt(int id) {
		for (Restaraunt u : restaraunts){
			if(u.getId() == id){
				return u;
			}
		}
		return new Restaraunt(id, 0, "", "", 0.0, 0.0, 0); // Blank Restaraunt to stop null reference
	}

	public boolean addRestaraunt(Restaraunt input) {
		restaraunts.add(input);
		return true;
	}

	public Promo getPromo(String code) {
		for (Promo u : promos){
			if(u.getPromoCode().equals(code)){
				return u;
			}
		}
		return new Promo(code, 0, "2000-01-01", "2000-01-01"); // Blank Promo to stop null reference
	}

	public boolean addPromo(Promo imput) {
		promos.add(imput);
		return true;
	}

	public Order getOrder(int id) {
		for (Order u : orders){
			if(u.getOrderId() == id){
				return u;
			}
		}
		return new Order(id, 0, "2000-01-01", OrderStatus.cart, ""); // Blank Promo to stop null reference
	}

	public boolean addOrder(Order input) {
		orders.add(input);
		return true;
	}

	// These are unsafe as I am deseralizing array lists the Java Run time knows they are array lists but doesn't know what is stored in those array lists.
	// Which im casting to their respective classes
	private boolean fetchLogins() {
		logins = store.fetchLogin(); // I know what i did here is unsafe but provided we use the API it should be fine
		for(Login u : logins) {
			if (u.getLoginID() > Login.getNumber()){
				Login.setNumber(u.getLoginID() + 1);
			}
		}
		return true;
	}

	private boolean fetchUser() {
		users = store.fetchUser(); // I know what i did here is unsafe but provided we use the API it should be fine
		for(User u : users) {
			if (u.getId() > User.getHighId()){
				User.setHighId(u.getId() + 1);
			}
		}
		return true;
	}
	private boolean fetchRestaraunt() {
		restaraunts = store.fetchRestaraunt(); // I know what i did here is unsafe but provided we use the API it should be fine
		for(Restaraunt u : restaraunts) {
			if (u.getId() > Restaraunt.getHighNum()){
				Restaraunt.setHighNum(u.getId() + 1);
			}
		}
		return true;
	}

	private boolean fetchPromo() {
		// THIS DOESN'T HAVE ID NUMBERS THEY ARE IDENTIFIED BY PROMO CODE
		promos = store.fetchPromo(); 
		// again I used Unsafe code
	
		return true;
	}

	private boolean fetchOrder() {
		orders = store.fetchOrder(); // probably realised still unsafe code
		for(Order u : orders) {
			if (u.getOrderId() > Order.getNumber()){
				Order.setNumber(u.getOrderId() + 1);
			}
		}
		return true;
	}

	private boolean writeLogins() { // returns true if data is saved, false for Exception
		store.setLogin(logins);
		return false;
	}

	private boolean writeUsers() { // returns true if data is saved, false for Exception
		store.setUser(users);
		return false;
	}
	
	private boolean writeRestaraunt() { // returns true if data is saved, false for Exception
		store.setRestaraunt(restaraunts);
		return false;
	}

	private boolean writePromo() { // returns true if data is saved, false for Exception
		store.setPromo(promos);
		return false;
	}

	private boolean writeOrders() {
		return store.setOrder(orders); // returns true if data is saved, false for Exception

	}

	// getting data from the communications object to input into the datamodel
	private Login recieveLogin() {
		return null;
	}

	private User receiveUser() {
		return null;
	}

	private Restaraunt receiveRestaraunt() {
		return null;
	}

	private Promo recievePromo() {
		return null;
	}

	private Order recieveOrder() {
		return null;
	}

	// sending data to the communications class to be sent to clients
	private boolean sendLogin(Login out) {
		return false;
	}

	private boolean sendUser(User out) {
		return false;
	}

	private boolean sendRestaraunt(Restaraunt out){
		return false;
	}

	private boolean sendPromo(Promo out) {
		return false;
	}

	private boolean sendOrder() {
		return false;
	}


}
