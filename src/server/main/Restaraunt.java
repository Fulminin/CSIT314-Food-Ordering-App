import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Restaraunt {
	private int restaurantId;
	private int loginId;
	private String name;
	private String description;
	private double credit;
	private double rating;
	private int ratingCount;
	private BufferedImage image;

// The Hell am I going to do these
	private ArrayList<Address> addresses;
	private ArrayList<String> tags;
	private ArrayList<Food> menu;
	private ArrayList<Order> orders;

	public Restaraunt(int restaurantId, int loginId, String name, String description, double credit, double rating, int ratingCount, BufferedImage image){
		this.restaurantId = restaurantId;
		this.loginId = loginId;
		this.name = name;
		this.description = description;
		this.credit = credit;
		this.rating = rating;
		this.ratingCount = ratingCount;
		this.image = image;
	}
}
