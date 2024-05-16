public class User {
	public int userId;
	public int loginId;
	public String firstName;
	public String lastName;
	public double credit;
	public MemberStatus memberStatus;

	public User(int userId, int loginId, String firstName, String lastName, double credit, MemberStatus memberStatus) {
		this.userId = userId;
		this.loginId = loginId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.credit = credit;
		this.memberStatus = memberStatus;
	}
}
