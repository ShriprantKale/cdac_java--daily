package abstractrion;

import static java.lang.Math.pow;

abstract class BankAcc {
 protected int id;
 protected float balance;
 

	public BankAcc(float balance, int id) {
		super();
		this.id = id;
		this.balance =balance ;
	}

}