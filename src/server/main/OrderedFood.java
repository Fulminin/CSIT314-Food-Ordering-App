public class OrderedFood {
	private int foodId;
	private int quantity;

	public OrderedFood(int foodId, int quanitiy) {
		this.foodId = foodId;
		this.quantity = quanitiy;
	}

	public int getFoodId() {
		return foodId;
	}

	public int getQty() {
		return quantity;
	}

	public boolean changeQty(int num) {
		this.quantity = num;
		return true;
	}
}
