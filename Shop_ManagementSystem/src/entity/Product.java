package entity;

public class Product {

	private String Pname;
	private double price;
	private int pid;
	private boolean stock;

	public Product(String pname, double price, int pid, boolean stock) {
		super();
		Pname = pname;
		this.price = price; 
		this.pid = pid;
		this.stock = stock;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [Pname=" + Pname + ", price=" + price + ", pid=" + pid + ", stock=" + stock + "]";
	}

}
