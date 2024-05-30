import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;

public class JSONStorage{
	private final String loginFileName = "login.json";
	private final String userFileName = "user.json";
	private final String RestarauntFileName = "restaraunt.json";
	private final String PromoFileName = "promo.json";

	// fetch login
	public ArrayList<Login> fetchLogin(){
		File loginIn = new File(loginFileName);
		try{
			FileReader loginReader = new FileReader(loginIn);
			Gson gson = new Gson();
			Login[] loginInput = gson.fromJson(loginReader, Login[].class);
			ArrayList<Login> out = new ArrayList<Login>(Arrays.asList(loginInput));
			return out;
		} catch (IOException e) {
			System.out.println("Could not Read file: Login");
			return null;
		}
	}

	// fetch user
	public ArrayList<User> fetchUser(){
		File userIn = new File(userFileName);
		try{
			FileReader userReader = new FileReader(userIn);
			Gson gson = new Gson();
			User[] userInput = gson.fromJson(userReader, User[].class);
			ArrayList<User> out = new ArrayList<User>(Arrays.asList(userInput));
			return out;
		} catch (IOException e) {
			System.out.println("Could not Read file: User");
			return null;
		}
	}

	// fetch restaraunt
	public ArrayList<Restaraunt> fetchRestaraunt(){
		File restIn = new File(RestarauntFileName);
		try{
			FileReader restReader = new FileReader(restIn);
			Gson gson = new Gson();
			Restaraunt[] restInput = gson.fromJson(restReader, Restaraunt[].class);
			ArrayList<Restaraunt> out = new ArrayList<Restaraunt>(Arrays.asList(restInput));
			return out;
		} catch (IOException e) {
			System.out.println("Could not Read file: Restaraunt");
			return null;
		}
	}

	// fetch promo
	public ArrayList<Promo> fetchPromo(){
		File promoIn = new File(PromoFileName);
		try{
			FileReader promoReader = new FileReader(promoIn);
			Gson gson = new Gson();
			Promo[] promoInput = gson.fromJson(promoReader, Promo[].class);
			ArrayList<Promo> out = new ArrayList<Promo>(Arrays.asList(promoInput));
			return out;
		} catch (IOException e) {
			System.out.println("Could not Read file: Restaraunt");
			return null;
		}
	}

	// set login
	public boolean setLogin(ArrayList<Login> loginList) {
		File loginFile = new File(loginFileName);
		Gson gson = new Gson();
		try{
			FileWriter loginWriter = new FileWriter(loginFile);
			String loginOutput = gson.toJson(loginList);
			loginWriter.write(loginOutput);
			loginWriter.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	// set user
	public boolean setUser(ArrayList<User> userList) {
		File userFile = new File(userFileName);
		Gson gson = new Gson();
		try{
			FileWriter userWriter = new FileWriter(userFile);
			String userOutput = gson.toJson(userList);
			userWriter.write(userOutput);
			userWriter.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	// set restaurant
	public boolean setRestaraunt(ArrayList<Restaraunt> restList) {
		File restFile = new File(RestarauntFileName);
		Gson gson = new Gson();
		try{
			FileWriter restWriter = new FileWriter(restFile);
			String restOutput = gson.toJson(restList);
			restWriter.write(restOutput);
			restWriter.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	// set promo
	public boolean setPromo(ArrayList<Promo> promoList) {
		File promoFile = new File(PromoFileName);
		Gson gson = new Gson();
		try{
			FileWriter promoWriter = new FileWriter(promoFile);
			String promoOutput = gson.toJson(promoList);
			promoWriter.write(promoOutput);
			promoWriter.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}
}
