package day4;

public class UpwardCasting {
public static void main(String args[]) {
	int a=100;
	double d=a;//upward casting:automatically
	System.out.println(d);
	
	double d1=66.99;
	int i=(int)d1;//sownward casting: explicit
	System.out.println(i);
	
}
}
