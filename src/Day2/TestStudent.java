package Day2;

public class TestStudent {
public static void main(String args[]) {
//Student student=new student();
//student.rollNo=1;
//student.name="shree";
//student.score='88.2';
//
//System.out.println("calling the methods");
//student.display();
//student.completeassighnment();
//student.attendtheclass();
//student.apperexam();
//
//System.out.println("=================");
//System.out.println("Creating 2nd obj");
System.out.println("creating an object");
Student student=new Student();

student.accept();

student.display();
student.completeassignments();
student.attendtheclass();
student.apperexam();

}
}
