package Day;

import java.util.Scanner;

public class Emp {
	//mv
 String empid;
 String empname;
 int salary;

Scanner sc=new Scanner(System.in);
public void accept() {
	System.out.println("enter the empid");
	empid=sc.next();
	System.out.println("enter the empname");
	empname=sc.next();
	System.out.println("enter the salary");
	salary=sc.nextInt();
}

//mf
public void overtime()
{
	System.out.println("overtime ");
}
public void attends(){
	System.out.println("attends");
}
public void completeproject(){
	System.out.println("complete project");}

public void display() {
	System.out.println("empid is="+empid);
	System.out.println("empname="+empname);
	System.out.println("salary="+salary);
	
}
}