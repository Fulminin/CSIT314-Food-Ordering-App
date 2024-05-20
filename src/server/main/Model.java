import java.util.ArrayList;

public class Model {
	ArrayList<Login> logins;
	ArrayList<User> users;
	ArrayList<Restaraunt> restaraunts;
	ArrayList<Promo> promos;
	ArrayList<Order> orders;
	Communication comms;
	Storage store;
	
	public static void main(String[] args){

	}

	public Model(Storage keep, Communication talk) {

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

	private boolean fetchLogins() {
		return false;
	}

	private boolean fetchUser() {
		return false;
	}

	private boolean fetchRestaraunt() {
		return false;
	}

	private boolean fetchPromo() {
		return false;
	}

	private boolean fetchOrder() {
		return false;
	}

	private boolean writeLogins() {
		return false;
	}

	private boolean writeUsers() {
		return false;
	}
	
	private boolean writeRestaraunt() {
		return false;
	}

	private boolean writePromo() {
		return false;
	}

	private boolean writeOrders() {
		return false;
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
