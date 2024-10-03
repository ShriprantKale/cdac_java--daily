package day4;

import java.util.Scanner;

public class Circle {
	private double radius;
	private double area1;
	private double peri;
	
	static double PI;
	static double TAX;
	
	final double PI=3.14;
	Scanner sc=new Scanner(System.in);
	
	public void accept() {
System.out.println("enter the radius");
radius=sc.nextDouble();

}
	public void display() {
	System.out.println("radius="+radius);
	System.out.println("area="+area1);
	System.out.println("perimeter="+peri);
}
	public void calArea() {
	area1=PI*radius*radius;
	
}
	public void calperi() {
		peri=2*PI*radius;
	}

}
