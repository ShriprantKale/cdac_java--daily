package day4;


class MyClass2 {
public void fun2() {
	System.out.println(" this is fun 1");
}
}
class MyClass1{
	public void fun1(){
		System.out.println(" thid is fun 2");
	}
}
public class MyClass{
	public static void main(String args[]) {
		MyClass1 myclass1=new MyClass1();
		myclass1.fun1();
		
		MyClass2 myclass2=new MyClass2();
		myclass2.fun2();
	}
}

