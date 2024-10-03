package Day2;

import java.util.Scanner;

public class Watch {
	//mv
 String Brand;
 String Style;
 int price;

Scanner sc=new Scanner(System.in);
public void accept() {
	System.out.println("enter the Brand");
	Brand=sc.next();
	System.out.println("enter the Style");
	Style=sc.next();
	System.out.println("enter the price");
	price=sc.nextInt();
}

//mf
public void batterytype()
{
	System.out.println("Battery type ");
}
public void sensors(){
	System.out.println("sensors");
}
public void type(){
	System.out.println("type");}

public void display() {
	System.out.println("Brand is="+Brand);
	System.out.println("Style="+Style);
	System.out.println("Price="+price);
	
	
}
}


