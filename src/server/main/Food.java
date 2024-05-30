import java.io.Serializable;

public class Food implements Serializable{
	private int foodId;
	private String name;
	private String description;
	private double price;

	public Food(int foodId, String name, String description, double price){
		this.foodId = foodId;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return foodId;
	}

	public boolean setId(int input) {
		this.foodId = input;
		return true;
	}

	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		this.name = name;
		return true;
	}

	public String getDescription() {
		return description;
	}

	public boolean setDescription(String des) {
		this.description = des;
		return true;
	}

	public double getPrice() {
		return price;
	}

	public boolean setPrice(double price) {
		this.price = price;
		return true;
	}
}
