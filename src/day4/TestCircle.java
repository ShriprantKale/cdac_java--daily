package day4;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle circle=new Circle();
Circle circle1=new Circle();
Circle circle2=new Circle();
Circle circle3=new Circle();
circle.accept();
circle.calperi();
circle.calArea();
circle.display();

System.out.println(circle.hashCode());
System.out.println(circle2.hashCode());
System.out.println(circle3.hashCode());

//compare the object

circle.equals(circle3);
	}

}
