import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class User implements Serializable{
	private int userId;
	private int loginId;
	private String firstName;
	private String lastName;
	private double credit;
	private MemberStatus memberStatus;
	private ArrayList<Address> address;
	public static int highId = 0;

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

	public static int getHighId(){
		return highId;
	}

	public static boolean setHighId(int input){
		highId = input;
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

	public boolean equals(Object check) {
		if(this == check) {
			return true;
		}
		else if(check == null || getClass() != check.getClass()) {
			return false;
		}
		else {
			// int userId, int loginId, String firstName, String lastName, double credit, MemberStatus memberStatus
			User use = (User) check;
			if(userId == use.getId() 
				&& loginId == use.getLoginId() 
				&& firstName.equals(use.getFirstname())
				&& lastName.equals(use.getLastName())
				&& credit == use.getCredit()
				&& memberStatus == use.getMemberStatus()
				) {
				return true;
			}
			else {
				return false;
			}
		}

	}
}
