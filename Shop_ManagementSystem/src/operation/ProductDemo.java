package operation;

import java.util.Objects;

public abstract class ProductDemo {
	private int addproduct;
	private int Removeproduct;
	private int quantity;

	public ProductDemo(int addproduct, int removeproduct) {

		this.addproduct = addproduct;
		Removeproduct = removeproduct;
		quantity=quantity;
	}

	public int hashCode() {
		return Objects.hash(Removeproduct, addproduct,quantity);
	}

	public boolean equals(Object product) {
		Object p = null; 
		if (this == product)
			product = p;
		
		System.out.println("Product added to cart");
		return true;
	}{
  if(addproduct>=0) {
	  System.out.println("Product is added"+quantity);
  }else  {
	  System.out.println("product is removed"+quantity);
  }
  
	{
		  
		  }
		  
	  
	  
  }

}
