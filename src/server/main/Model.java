import java.util.ArrayList;

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
		mainProgram.readAllFromStorage();
		mainProgram.mainLoop();
		mainProgram.writeAllToStorage();
	}

	public Model() {
		store = new DataStorage();
	}

	public void mainLoop(){
		runningLikeAChamp = true;
		while (runningLikeAChamp = true){

			if(runningLikeAChamp == false){
				return;
			}
		}

	}

	public boolean connect() {
		return false;
	}

	public boolean disconnect() {
		return false;
	}

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

	public void writeAllToStorage() {
		writeLogins();
		writeUsers();
		writeRestaraunt();
		writePromo();
		writeLogins();

	}

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

	public Login getLogin(int pos) {
		return null;
	}

	public boolean addLogin(Login input) {
		return false;
	}

	public User getUser(int pos) {
		return null;
	}

	public boolean addUser(User input) {
		return false;
	}

	public Restaraunt getRestaraunt(int pos) {
		return null;
	}

	public boolean addRestaraunt(Restaraunt input) {
		return false;
	}

	public Promo getPromo(int pos) {
		return null;
	}

	public boolean addPromo(Promo imput) {
		return false;
	}

	public Order getOrder(int pos) {
		return null;
	}

	public boolean addOrder(Order input) {
		return false;
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
