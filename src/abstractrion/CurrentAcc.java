package abstractrion;

public class CurrentAcc extends BankAcc {
public CurrentAcc(int id,float balance) {
	super(balance,id);
	
}
public float CalculateInterest() {
	return(balance*0.1f);
}
}
