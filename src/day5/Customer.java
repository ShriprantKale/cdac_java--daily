package day5;

public class Customer {
	private String name;
	private String address;
	private int mobileno;

	public Customer() {

		mobileno =0;
		name = " ";
		address = " ";
	}

	public Customer(int mobileno, String name, String address) {
		super();//PARENT CLASS CONSTRUCTOR
		this.mobileno = mobileno;
		this.name = name;
		this.address =address;
	}
     public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void verifiedCustomer() {
		System.out.println(" verified customer");
}
}