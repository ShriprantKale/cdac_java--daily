package day5;

public class Accounts {
	private String accName;
	private int accNo;
	private double accBalance;

	public Accounts() {

		accNo =0;
		accName = " ";
		accBalance =0.0 ;
	}

public Accounts(String accName, int accNo, double accBalance) {
		super();
		this.accName = accName;
		this.accNo = accNo;
		this.accBalance = accBalance;
	}

public String getAccName() {
	return accName;
}

public void setAccName(String accName) {
	this.accName = accName;
}

public int getAccNo() {
	return accNo;
}

public void setAccNo(int accNo) {
	this.accNo = accNo;
}

public double getAccBalance() {
	return accBalance;
}

public void setAccBalance(double accBalance) {
	this.accBalance = accBalance;
}

   
}

