package tadoba;
import java.util.Scanner;
public class Menu {
public static void main(String args[]) {
	int ch;
	String choice;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println(" welcome to tadoba bank");
		System.out.println("1.display details");
		System.out.println("2.withdraw amount");
		System.out.println("3.deposite amount");
		System.out.println("4.transfer amount");
		System.out.println("5.check balance");
		System.out.println("6.transfer amount");
		System.out.println("7.update balance");
		System.out.println("8.exit");
		
		System.out.println("enter your choice");
		ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("display details");
			break;
		case 2:
			System.out.println(" withdraw amount");
			break;
		case 3:
			System.out.println(" deposite amount");
			break;
		case 4:
			System.out.println(" transfer amount");
			break;
		case 5:
			System.out.println("check balance");
			break;
		case 6:
			System.out.println("transfer amount");
			break;
		case 7:
			System.out.println("update  balance");
			break;
		case 8:
			System.exit(0);
		}
		System.out.println("do you want to continue?(y/n");
		choice=sc.next();
	}
	while(choice.equalsIgnoreCase("y"));
	System.out.println("thnak you for visiting !!!!");
	
}
}
