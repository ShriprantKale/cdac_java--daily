package Assignments;
import java.util.Scanner;
public class QueOne {
	
public static void main(String args[]) {
	String name="shree";
	int  age=25;
	 double income=30000;
	if(age>=18 && age<=60)
		System.out.println("person age is valid ="+age);
	else
		System.out.println("person age is not valid  ="+age);
	if(income>=25000)
		System.out.println("person is eligible for the loan");
}
}
