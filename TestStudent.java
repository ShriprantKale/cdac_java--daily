package day5;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno,name,score");
		int rollno=sc.nextInt();
		String name=sc.next();
		double score=sc.nextDouble();
		
		
Student student=new Student();//call defa const
student.setRollno(rollno);
student.setName(name);
student.setScore(score);

//student.display();
System.out.println("displaying the details......");
System.out.println(" roll no is "+student.getRollno());
System.out.println(" name is "+student.getName());
System.out.println(" score no is "+student.getScore());
student.markAttendence();

System.out.println("============================");
System.out.println("creating an object with parameters");
Student student2=new Student(2,"shriprant",85);
	
//	student2.display();
System.out.println("displaying the details......");
System.out.println(" roll no is "+student2.getRollno());
System.out.println(" name is "+student2.getName());
System.out.println(" score is "+student2.getScore());
	student2.markAttendence();
	
	System.out.println("================================");
	System.out.println("changing the name");
	System.out.println("enter the new name");
	String name1=sc.next();
	student2.setName(name1);
	System.out.println("new name is "+student2.getName());
	System.out.println(" name is "+student2.getRollno());
	System.out.println(" score is "+student2.getScore());
	}

}
