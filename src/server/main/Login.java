import java.io.Serializable;

public class Login implements Serializable{
	private int LoginID;
	private String username;
	private String password;
	private static int number = 0;

	public Login(String inUser, String inPass) {
		this.LoginID = number;
		this.username = inUser;
		this.password = inPass;
		number++;
	}

	public Login(int inLog, String inUser, String inPass) {
		this.LoginID = inLog;
		this.username = inUser;
		this.password = inPass;
	}

	public static void setNumber(int num) {
		number = num + 1;
	}

	public static int getNumber() {
		return number-1;
	}

	public int getLoginID() {
		return LoginID;
	}

	public void setLoginID(int inLog) {
		LoginID = inLog;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String inUser) {
		username = inUser;
	}

	public void setPassword(String inPass) {
		password = inPass;
	}

	public boolean equals(Object check) {
		if(this == check) {
			return true;
		}
		else if(check == null || getClass() != check.getClass()) {
			return false;
		}
		else {
			// int inLog, String inUser, String inPass
			Login log = (Login) check;
			if(LoginID == log.getLoginID() 
				&& username.equals(log.getUsername()) 
				&& password.equals(log.getPassword())) {
				return true;
			}
			else {
				return false;
			}
		}

	}
}
