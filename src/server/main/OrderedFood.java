import java.io.Serializable;

public class OrderedFood implements Serializable{
	private int foodId;
	private int orderId;
	private int quantity;

	public OrderedFood(int foodId, int orderId, int quanitiy) {
		this.foodId = foodId;
		this.orderId = orderId;
		this.quantity = quanitiy;
	}

	public int getFoodId() {
		return foodId;
	}

	public int getOrderId() {
		return orderId;
	}

	public int getQty() {
		return quantity;
	}

	public boolean changeQty(int num) {
		this.quantity = num;
		return true;
	}

	public boolean equals(Object check) {
		if(this == check) {
			return true;
		}
		else if(check == null || getClass() != check.getClass()) {
			return false;
		}
		else {
			OrderedFood orderCheck = (OrderedFood) check;
			if(foodId == orderCheck.getFoodId() && orderId == orderCheck.getOrderId() && quantity == orderCheck.getQty()) {
				return true;
			}
			else {
				return false;
			}
		}

	}
}
