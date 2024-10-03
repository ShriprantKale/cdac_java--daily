package day5;

public class WrapperDemo {
public static void main(String args[]) {
	String str="100";
	String str1="200";
	String str2="100.77";
	String str3="200.88";
	String str4="100.77";
	String str5="200.88";
	int str6=(2);
	int str7=(23);
			
	System.out.println("total is"+(Integer.parseInt(str)+Integer.parseInt(str1)));
	
	System.out.println("==================================");
	System.out.println("total is"+Double.parseDouble(str2)+Double.parseDouble(str3));
	
	System.out.println("==================================");
	System.out.println("total is"+(Float.parseFloat(str2)+Float.parseFloat(str3)));
	
	System.out.println("==================================");
	//System.out.println(" name is"+(Character.parseCharacter(str6)+Character.parseCharacter(str7)));
	
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Short.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	System.out.println(Short.MIN_VALUE);
}
}
