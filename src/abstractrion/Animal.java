package abstractrion;



public class Animal {
	final int legs=4;
	abstract public void sound();
	abstract public void fun1();
	abstract public void fun2();
	public void classInfo(String type) {
		System.out.println(" I belongs to"+type +"has" +legs+" legs");
	}
	class Dog extends animal{
		public void sound() {
			System.out.println(" the dog barks..");
			
		}
		public void fun1() {
			System.out.println(" this is fun1");
		}
		public void fun2() {
			System.out.println(" this is fun2");
			
		}
	}
	public classTestAnimal{
	public static void main	
	}
}

}
