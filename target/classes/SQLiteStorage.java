import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Blob;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

// need to write Statements

public class SQLiteStorage implements Storage {
	// FIELDS
	private static Connection SQLConn = null;

	// INTERFACE METHODS
		// fetch login
		public Login fetchLogin(String username){
			String statement = String.format("SELECT * from Login WHERE username = %s", username);
			try{
				ResultSet rs = selectStatement(statement);
				Login rLog = new Login(rs.getInt("logid"), rs.getString("username"), rs.getString("password"));
				return rLog;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				return null;
			}
		}
// Not Sure of I have thought Though how i am going to get UserId
		// fetch user
		public User fetchUser(int userNumber){
			String statement = String.format("SELECT * from User WHERE userId = %d", userNumber);
			ResultSet rs = selectStatement(statement);
			MemberStatus mem = MemberStatus.Normal;
			try {
				if(rs.getString("memberStatus").equals("Member")){
					mem = MemberStatus.Member;
				}
				User rUser = new User(rs.getInt("userId"), rs.getInt("loginId"), rs.getString("firstName"), rs.getString("lastName"), rs.getDouble("credit"), mem);
				return rUser;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				return null;
			}
		}

// Not Sure of I have thought Though how i am going to get restaurantId
		// fetch restaraunt
		public Restaraunt fetchRestaraunt(int restNumber){
			String statement = String.format("SELECT * from Restaraunt WHERE restarauntID = %d", restNumber);
			ResultSet rs = selectStatement(statement);
			BufferedImage restImage = null;
			try {
				Blob pictureInput = rs.getBlob("image");
				InputStream imageStream = pictureInput.getBinaryStream(0, pictureInput.length());
				try {
					restImage = ImageIO.read(imageStream);
				} catch (IOException ex) {
					restImage = null;
				}
				Restaraunt rRest = new Restaraunt(rs.getInt("restarauntId"), rs.getInt("loginId"), rs.getString("name"), rs.getString("description"), rs.getDouble("credit"), rs.getDouble("rating"), rs.getInt("ratingCount"), restImage);
				return rRest;
			} catch (SQLException e){
				return null;
			}
		}

		// fetch promo
		public Promo fetchPromo(String promocode){
			String statement = String.format("SELECT * from Promo WHERE promoCode = %s", promocode);
			ResultSet rs = selectStatement(statement);
			try {
			Promo rPromo = new Promo(rs.getString("promoCode"), rs.getDouble("discount"), rs.getDate("startDate"), rs.getDate("endDate"));
			return rPromo;
			} catch (SQLException e) {
				return null;
			}
		}
		// set login
		public boolean setLogin(Login newLogin){
			String statement = String.format("INSERT INTO login VALUES (%d, %s, %s)", newLogin.getLoginID(), newLogin.getUsername(), newLogin.getPassword());
			return insertRecord(statement);
		}
		// set user
		public boolean setUser(User newUser){
			String mem = null;
			if(newUser.memberStatus == MemberStatus.Member) {
				mem = "Member";
			} else {
				mem = "Normal";
			}
			String statement = String.format("InSERT INTO users VALUES (%d, %d, %s, %s, %d)", newUser.userId, newUser.loginId, newUser.firstName, newUser.lastName, newUser.credit, mem);
			return insertRecord(statement);
		}
		
		// set restaurant
		public boolean setRestaraunt(Restaraunt newRestaraunt){
			return false;
		}
		// set promo
		public boolean setPromo(Promo newPromo){
			return false;
	}

	// DATABASE METHODS
	private final static boolean connect(){
		String uri = "jdbc:sqlite:/foodDeliveryApp.db";
		try{
			SQLConn = DriverManager.getConnection(uri);

			System.out.println("Connection to DataBase Established");
			return true;
		} catch(SQLException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			try {
				if(SQLConn != null) {
					SQLConn.close();
					return false;
				};
			} catch (SQLException ex) {
					System.out.println(ex.getMessage());
					return false;
				}
			
		}
	}

	private final static boolean disconnect() {
		try{
			if(SQLConn != null) {
				SQLConn.close();
				System.out.println("Disconnected from Database");
				return true;
			} else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	private final static boolean createNewDatabase(String name) {
		try{
			SQLConn = DriverManager.getConnection(name);
			if(SQLConn != null){
				DatabaseMetaData meta = SQLConn.getMetaData();
				System.out.println("driver:\t" + meta.getDriverName());
				System.out.println("New Database Created");
				return true;
			}
			return false;
		} catch(SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public final static boolean createNewTable(String tableinput) {
		try {
			PreparedStatement statement = SQLConn.prepareStatement(tableinput);  
			statement.executeUpdate();
			System.out.println("Table has been Created");
			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	private final static boolean insertRecord(String input) {
		try {
			System.out.println(input);
			PreparedStatement statement = SQLConn.prepareStatement(input);
			statement.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	private final static ResultSet selectStatement(String input) {
		try {
			System.out.println(input);
			PreparedStatement statement = SQLConn.prepareStatement(input);
			ResultSet result = statement.executeQuery();
			return result;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	private final static boolean updateStatement(String input) {
		try {
			System.out.println(input);
			PreparedStatement statement = SQLConn.prepareStatement(input);
			statement.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

}
