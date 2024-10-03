package day5;

public class Student {
	private int rollno;
	private String name;
	private double score;

	public Student() {

		rollno = 0;
		name = "";
		score = 0.0;

		// TODO Auto-generated constructor stub
	}
	// public Student() {
//	System.out.println("this is an default constructor");
//		rollno = 0;
//		name = "";
//		score = 0.0;

	public Student(int rollno, String name, double score) {
		super();//PARENT CLASS CONSTRUCTOR
		this.rollno = rollno;
		this.name = name;
		this.score = score;
	}

//
//	public Student(int rollno, String name, double score) {
//		System.out.println("this is a parametrised constructor");
//		this.rollno = rollno;
//		this.name = name;
//		this.score = score;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
//
//	public void display() {
//		System.out.println("rollno" + rollno);
//		System.out.println("name" + name);
//		System.out.println("score" + score);
	//}

	public void markAttendence() {
		System.out.println("marking the attendence");
	}
}
