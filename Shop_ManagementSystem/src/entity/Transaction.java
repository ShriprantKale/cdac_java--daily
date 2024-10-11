package entity;

public class Transaction {
	private int product;
	private double billing;
	private boolean update;
	private int purchase;

	public Transaction(int product, double billing, boolean update, int purchase) {// object
		super();
		this.product = product;
		this.billing = billing;
		this.update = update;
		this.purchase = purchase;
	}

	public int getProduct() {
		return product; 
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public double getBilling() {
		return billing;
	}

	public void setBilling(double billing) {
		this.billing = billing;
	}

	public boolean isUpdate() {
		return update;
	}

	public void setUpdate(boolean update) {
		this.update = update;
	}

	public int getPurchase() {
		return purchase;
	}

	public void setPurchase(int purchase) {
		this.purchase = purchase;
	}

	@Override
	public String toString() {
		return "Transaction [product=" + product + ", billing=" + billing + ", update=" + update + ", purchase="
				+ purchase + "]";
	}

}
