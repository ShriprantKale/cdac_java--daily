package Day2;
import java.util.Scanner;
public class Student
{
	//mv
private int rollNo;
private String name;
private double score;

Scanner sc=new Scanner(System.in);
public void accept() {
	System.out.println("enter the rollNo");
	rollNo=sc.nextInt();
	System.out.println("enter the name");
	
	System.out.println("enter the score");
	score=sc.nextInt();
}

//mf
public void attendtheclass()
{
	System.out.println("attend the class");
}
public void apperexam(){
	System.out.println("apper exam");
}
public void completeassignments(){
	System.out.println("complete assignments");}

public void display() {
	System.out.println("roll no is="+rollNo);
	System.out.println("name="+name);
	System.out.println("score="+score);
	
	
}
}
