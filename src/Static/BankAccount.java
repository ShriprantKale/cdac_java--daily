package Static;

public class BankAccount {
private int accNo;
private double balance;

private static int idnum=1;

public BankAccount() {
}{
	

accNo=idnum++;
balance=0;
}

public BankAccount(double balance) {
	this.accNo=idnum++;
	this.balance=balance;
	
}
public static int getIdnum() {
	return idnum;
	
}
@Override
public String toString() {
	return "BankAccount [accNo=" + accNo + ", balance=" + balance + "]";
}
public static void main(String args[]) {
	BankAccount bankaccount1=new BankAccount();
	System.out.println(bankaccount1);
	BankAccount bankaccount2=new BankAccount();
	System.out.println(bankaccount2);
	BankAccount bankaccount3=new BankAccount();
	System.out.println(bankaccount3);
}

}


