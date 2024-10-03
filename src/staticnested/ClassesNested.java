package staticnested;
class OuterClass{
	private static String msg="Welcome to nested classes";
	public static class NestedClass{
		public void printMessage() {
			//can access only satic diplay
			System.out.println("Message from nested static class "+msg);
			
		}
	}
	public class InnerClass{
		public void display() {
			System.out.println("Message from non satic nested class:"+msg);
			
		}
	}
	
	
}
public class ClassesNested {

	public static void main(String[] args) {
		OuterClass.NestedStaticClass printer=new OuterClass.NestedStaticClass();
		printer.printmessage();
		
		Outerclass  outer  = new OuterClass();
		
		OuterClass.InnerClass inner=new OuterClass.InnerClass();
		inner.display();
		
	}
		
	}


