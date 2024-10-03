package day4;

public class OverloadMain {
//taking all static after succesful run
	public  static void main() {
		System.out.println("method without parameters");
	
	}
	public static void main(int a,int b) {
		System.out.println("method with two parameters");
		
	}
	public  static void main(int a) {
		System.out.println("method with 1 parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     OverloadMain obj=new OverloadMain();
     main();
     main(10);
     main(10, 33);
	}

}
