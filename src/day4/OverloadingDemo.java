package day4;

public class OverloadingDemo {

	static public int add(int a,int b) {
		return (a+b);
	}
	static public int add(int a,int b,int c) {
		return(a+b+c);
	}
	static public double add( int a,double b) {
		return(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int result=add(10,20);
         System.out.println(result);
         int result1=add(12,34,45);
         System.out.println(result1);
         double result2=add(13,29.3);
         System.out.println(result2);
	}

}
