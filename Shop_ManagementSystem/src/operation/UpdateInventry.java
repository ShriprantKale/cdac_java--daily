package operation;

import java.util.Objects;

public class UpdateInventry {
	private boolean instock;
	private boolean outofstock;
	

	public UpdateInventry(boolean instock, boolean outofstock) {
		super();
		this.instock = instock;
		this.outofstock = outofstock;
	}

	public int hashCode() {
		return Objects.hash(instock, outofstock);
	}

	public boolean equals(Object instock) {
		if (this == instock)
			return true;
		System.out.println("product is in stock");
		if (instock == null)
			return false;
		System.out.println("product is out of stock");
		if (getClass() != instock.getClass())
			return false;
		UpdateInventry other = (UpdateInventry) instock;
		return equals(instock) == other.instock && outofstock == other.outofstock;
	}

}
