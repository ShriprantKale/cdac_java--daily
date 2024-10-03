package interfacepack;

public class Circle implements Graphics {
private float radius;
public Circle(float radius) {
	super();
	this.radius=radius;
	
}
@Override
public float area() {
	// TODO Auto-generated method stub
	return PI *radius*radius;
}
@Override
public float perimeter() {
	// TODO Auto-generated method stub
	return 2*PI*radius;
}

	
}

	

