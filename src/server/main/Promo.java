import java.time.LocalDate;

public class Promo {
	private String promoCode;
	private double discount;
	private LocalDate startDate;
	private LocalDate endDate;

	public Promo(String promoCode, double discount, String startDate, String endDate) {
		this.promoCode = promoCode;
		this.discount = discount;
		this.startDate = LocalDate.parse(startDate); // needs to be in the format YYYY-MM-DD
		this.endDate = LocalDate.parse(endDate); // needs to be in the format YYYY-MM-DD
	}

	// promo code
	public String getPromoCode() {
		return promoCode;
	}

	public boolean setPromoCode(String promoCode){
		this.promoCode = promoCode;
		return true;
	}

	// discount
	public double getDiscount() {
		return discount;
	}

	public boolean setDiscount(double discount) {
		this.discount = discount;
		return true;
	}

	// start date
	public String getStartDate() {
		return startDate.toString();  // outputs format YYYY-MM-DD
	}

	public boolean setStartDate(String startDate) {
		this.startDate = LocalDate.parse(startDate);  // needs to be in the format YYYY-MM-DD
		return true;
	}

	// end date
	public String getEndDate() { // outputs format YYYY-MM-DD
		return endDate.toString();
	}

	public boolean setEndDate(String endDate) { 
		this.endDate = LocalDate.parse(endDate);  // needs to be in the format YYYY-MM-DD
		return true;
	}
}
