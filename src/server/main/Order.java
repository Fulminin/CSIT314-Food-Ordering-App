import java.util.ArrayList;
import java.util.Date;

public class Order {
	private int orderId;
	private int restarauntId;
	private int userId;
	private Date orderDate;
	private ArrayList<OrderedFood> foodOrdered;
	private OrderStatus status;
	private String promoCode;
	public static int numbers = 0;

	public Order(int orderId, int restarauntId, int userId, Date orderDate, OrderStatus status, String promoCode) {
		this.orderId = orderId;
		this.restarauntId = restarauntId;
		this.userId = userId;
		this.orderDate = orderDate;
		this.status = status;
		this.promoCode = promoCode;
		if(orderId > numbers){
			numbers = orderId+1;
		}
	}

	public Order(int restarauntId, int userId, Date orderDate, OrderStatus status, String promoCode) {
		this.orderId = numbers++;
		this.restarauntId = restarauntId;
		this.userId = userId;
		this.orderDate = orderDate;
		this.status = status;
		this.promoCode = promoCode;
	}

	public int getOrderId() {
		return orderId;
	}

	public int getRestaurantId() {
		return restarauntId;
	}

	public int getUserId() {
		return userId;
	}

	public Date getDate() {
		return orderDate;
	}

	public OrderedFood getFood(int foodIndex) {
		return foodOrdered.get(foodIndex);
	}

	public boolean addFood(OrderedFood inputFood) {
		foodOrdered.add(inputFood);
		return true;
	}

	public boolean removeFood(int foodId) {
		boolean succ = false;
		for (int pos = 0; pos < foodOrdered.size(); pos++) {
			if(foodOrdered.get(pos).getFoodId() == foodId){
				foodOrdered.remove(pos);
				succ = true;
				break;
			}
		}
		return succ;
	}

	public OrderStatus getProgress() {
		return status;
	}

	public boolean setProgress(OrderStatus inputStatus) {
		this.status = inputStatus;
		return true;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public boolean setPromoCode(String code) {
		this.promoCode = code;
		return true;
	}
}
