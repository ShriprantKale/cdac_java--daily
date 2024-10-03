package Day2;

import java.nio.file.spi.FileSystemProvider;

public class MathDemo {
public static void main(String args[]) {
	System.out.println(Math.sqrt(144));//square
	System.out.println(Math.abs(-66));//converts into +ve
	System.out.println(Math.min(33, 55));//33
	System.out.println(Math.max(33, 44));//44
	System.out.println("no is="+Math.random());
	double d=(int)(Math.random()*100);
	System.out.println("d is"+d);
	

	System.out.println(Math.round(675.23));
	System.out.println(Math.ceil(603));
	System.out.println(Math.floor(604));
	System.out.println(6224);
	System.out.println(Math.pow(4, 7));
	
	
	
	System.out.println(Math.exp(22)); 
	System.out.println(Math.rint(33));
     System.out.println(Math.absExact(8768));
	System.out.println(Math.acos(44));
	System.out.println(Math.scalb(4, 5));
}
}
