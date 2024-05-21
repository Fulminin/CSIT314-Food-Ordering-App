public class OrderedFood {
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
}
