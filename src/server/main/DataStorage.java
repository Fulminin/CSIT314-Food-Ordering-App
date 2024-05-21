import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileInputStream;

public class DataStorage implements Storage{
	File loginSave = new File("loginSave.ser");
	File userSave = new File("userSave.ser");
	File OrderSave = new File("orderSave.ser");
	File promoSave = new File("promoSave.ser");
	File restarauntSave = new File("restarauntSave.ser");

	public ArrayList<Login> fetchLogin() {
		try {
			FileInputStream fileIn = new FileInputStream(loginSave);
			ObjectInputStream converter = new ObjectInputStream(fileIn);
			ArrayList<Login> logs = new ArrayList<Login>(Arrays.asList((Login[]) converter.readObject()));
			converter.close();
			fileIn.close();

			return logs;
		} catch (Exception e) {
			System.out.println("No File Found Returning empty array");
			return new ArrayList<Login>();
		}
	}

	public ArrayList<User> fetchUser() {
		try {
			FileInputStream fileIn = new FileInputStream(userSave);
			ObjectInputStream converter = new ObjectInputStream(fileIn);
			ArrayList<User> users = new ArrayList<User>(Arrays.asList((User[]) converter.readObject()));
			converter.close();
			fileIn.close();

			return users;
		} catch (Exception e) {
			System.out.println("No File Found Returning empty array");
			return new ArrayList<User>();
		}
	}

	public ArrayList<Restaraunt> fetchRestaraunt(){
		try {
			FileInputStream fileIn = new FileInputStream(restarauntSave);
			ObjectInputStream converter = new ObjectInputStream(fileIn);
			ArrayList<Restaraunt> rest = new ArrayList<Restaraunt>(Arrays.asList((Restaraunt[]) converter.readObject()));
			converter.close();
			fileIn.close();

			return rest;
		} catch (Exception e) {
			System.out.println("No File Found Returning empty array");
			return new ArrayList<Restaraunt>();
		}
	}

	public ArrayList<Promo> fetchPromo() {
		try {
			FileInputStream fileIn = new FileInputStream(promoSave);
			ObjectInputStream converter = new ObjectInputStream(fileIn);
			ArrayList<Promo> pros = new ArrayList<Promo>(Arrays.asList((Promo[]) converter.readObject()));
			converter.close();
			fileIn.close();

			return pros;
		} catch (Exception e) {
			System.out.println("No File Found Returning empty array");
			return new ArrayList<Promo>();
		}
	}

	public boolean setLogin(ArrayList<Login> newLogin){
		try {
			FileOutputStream fileOut = new FileOutputStream(loginSave, false);
			ObjectOutputStream converter = new ObjectOutputStream(fileOut);
			converter.writeObject(newLogin.toArray());
			converter.close();
			fileOut.close();

			return true;
		} catch (Exception e) {
			System.out.println("Data not Saved");
			return false;
		}
	}

	public boolean setUser(ArrayList<User> newUser) {
		try {
			FileOutputStream fileOut = new FileOutputStream(userSave, false);
			ObjectOutputStream converter = new ObjectOutputStream(fileOut);
			converter.writeObject(newUser.toArray());
			converter.close();
			fileOut.close();

			return true;
		} catch (Exception e) {
			System.out.println("Data not Saved");
			return false;
		}
	}

	public boolean setRestaraunt(ArrayList<Restaraunt> newRestaraunt) {
		try {
			FileOutputStream fileOut = new FileOutputStream(restarauntSave, false);
			ObjectOutputStream converter = new ObjectOutputStream(fileOut);
			converter.writeObject(newRestaraunt.toArray());
			converter.close();
			fileOut.close();

			return true;
		} catch (Exception e) {
			System.out.println("Data not Saved");
			return false;
		}
	}

	public boolean setPromo(ArrayList<Promo> newPromo) {
		try {
			FileOutputStream fileOut = new FileOutputStream(promoSave, false);
			ObjectOutputStream converter = new ObjectOutputStream(fileOut);
			converter.writeObject(newPromo.toArray());
			converter.close();
			fileOut.close();

			return true;
		} catch (Exception e) {
			System.out.println("Data not Saved");
			return false;
		}
	}
}
