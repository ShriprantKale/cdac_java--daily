package emailvalidation;
import java.util.Scanner;
public class Validation {
	private static final String Email = null;
	public static void checkEmail(String email) {
		int a=email.indexOf("@");
		int d=email.lastIndexOf("a");
		if(a>-1 && d>-1 && a<d)
			System.out.println("valid email id");
		else
			System.out.println("invalid email id");
		
	}
public static void main(String args[]) {
Scanner sc=new Scanner (System.in);
Validation validations =new Validation ();
System.out.println("Enter your email id ");
String Emails=sc.next();
Validation.checkEmail(Email);


}
}

