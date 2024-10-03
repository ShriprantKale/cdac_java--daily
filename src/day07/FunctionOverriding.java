package day07;
  class Shape{
	void calArea(String shape,int a,int b) {
		System.out.println("calArea of shape class");
	}
	void display() {
		System.out.println(" display of shape class ");
	}
	void  fun1() {
		System.out.println(" fun1 shape of a class");
	}
}
  class Rectangle extends Shape {
void calArea(String shape,int a,int b) {
	System.out.println("area is"+(a*b));
	
}
void display() {
	 super.display();
	 super.fun1();
	
}
}
public class FunctionOverriding{
	public static void  main(String args[]) {
		Shape shape=new Shape ();
		shape.calArea("shape",20,10);
		shape.display();
		
		System.out.println("==============");
		Rectangle rect=new Rectangle();
		rect.calArea("rectangle",20,30);
		rect.display();
		 
		System.out.println("===============");
		shape=new Rectangle();
		shape.calArea("rectangle",11,22);
		shape.display();
	}
	}

