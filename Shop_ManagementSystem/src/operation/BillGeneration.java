package operation;

import java.util.Objects;

public class BillGeneration {

	private int price;
	private int sale;
	private double discount;
	private double total_price;
	
	public BillGeneration(int price, int sale, double discount, double total_price) {
		super();
		this.price = price;
		this.sale = sale;
		this.discount = discount;
		this.total_price = total_price;
	}


	public int hashCode() {
		return Objects.hash(discount, price, sale, total_price);
	}


	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof BillGeneration)) {
			return false;
		}
		BillGeneration other = (BillGeneration) obj;
		return Double.doubleToLongBits(discount) == Double.doubleToLongBits(other.discount) && price == other.price
				&& sale == other.sale
				&& Double.doubleToLongBits(total_price) == Double.doubleToLongBits(other.total_price);
	}
	
}
