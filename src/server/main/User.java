import java.util.ArrayList;
import java.util.Arrays;

public class User {
	private int userId;
	private int loginId;
	private String firstName;
	private String lastName;
	private double credit;
	private MemberStatus memberStatus;
	private ArrayList<Address> address;

	public User(int userId, int loginId, String firstName, String lastName, double credit, MemberStatus memberStatus) {
		this.userId = userId;
		this.loginId = loginId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.credit = credit;
		this.memberStatus = memberStatus;
		this.address = new ArrayList<Address>();
	}

	// userId
	public int getId() {
		return userId;
	}

	public boolean setId(int in) {
		this.userId = in;
		return true;
	}

	// loginId
	public int getLoginId() {
		return loginId;
	}

	public boolean setLoginId(int id) {
		this.loginId = id;
		return true;
	}

	// firstname
	public String getFirstname() {
		return firstName;
	}

	public boolean setFirstName(String fname) {
		this.firstName = fname;
		return true;
	}

	// lastname
	public String getLastName() {
		return lastName;
	}

	public boolean setLastName(String lname) {
		this.lastName = lname;
		return true;
	}

	// credit
	public double getCredit() {
		return credit;
	}

	public boolean setCredit(double cred) {
		this.credit = cred;
		return true;
	}

	// memberStatus
	public MemberStatus getMemberStatus() {
		return memberStatus;
	}

	public boolean setMemberStatus(MemberStatus input) {
		this.memberStatus = input;
		return true;
	}

	// address
	public boolean addAddress(Address input){
		this.address.add(input);
		return true;
	}

	public boolean addAddressList(Address[] input) {
		this.address.addAll(Arrays.asList(input));
		return true;
	}

	public boolean addAddressList(ArrayList<Address> input) {
		this.address.addAll(input);
		return true;
	}

	public boolean removeAddress(int i) {
		this.address.remove(i);
		return true;
	}

	public Address getAddress(int i) {
		return address.get(i);
	}

	public ArrayList<Address> getAddressList() {
		return address;
	}
}
