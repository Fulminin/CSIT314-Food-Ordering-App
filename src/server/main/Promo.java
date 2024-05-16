import java.sql.Date;

public class Promo {
	private String promoCode;
	private double discount;
	private Date startDate;
	private Date endDate;

	public Promo(String promoCode, double discount, Date starDate, Date endDate) {
		this.promoCode = promoCode;
		this.discount = discount;
		this.startDate = starDate;
		this.endDate = endDate;
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
	public Date getStartDate() {
		return startDate;
	}

	public boolean setStartDate(Date startDate) {
		this.startDate = startDate;
		return true;
	}

	// end date
	public Date getEndDate() {
		return endDate;
	}

	public boolean setEndDate(Date endDate) {
		this.endDate = endDate;
		return true;
	}
}
