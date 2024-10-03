package Day3;

import java.util.Scanner;

public class user {
private String name;
private int age;
private double sal;

Scanner sc=new Scanner(System.in);
public void accept()
{
	System.out.println(" enter the name,age,salary");
	name=sc.next();
	age=sc.nextInt();
	sal=sc.nextInt();
}
public void checkage() {
	if(age>18)
		System.out.println(" you are eligible to vote");
	else if(age>18 && age<100)
		System.out.println("your age is valid");
	else
		System.out.println("invalid age");
	
}
public void checksal() {
	if(sal>0 && sal<1000000)
		System.out.println("salary is valid");
	else
		System.out.println("salary is invalid ");
}
public void display() {
	System.out.println("the name is"+name);
	System.out.println("The age is"+age);
	
	System.out.println("the salary is");
}
}
