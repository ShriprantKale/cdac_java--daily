package stringpack;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 StringBuilder sb=new StringBuilder("shree ");
                   sb.insert(6, " kaur ");
                   System.out.println(sb);
                   
                   sb.append("cdac nashik ");
                   System.out.println(sb);
                   
                   int i=sb.indexOf("r");
                   String e;
                   System.out.println(" i is"+i);
                   int e1=sb.lastIndexOf(null, 's');
                   System.out.println(" e1 is"+e1);
                   sb.replace(6,9,"new");
                   System.out.println(sb);

                   sb.delete(0, 5);
                   System.out.println(sb);
                   System.out.println(sb.reverse());
                   	}
	
}

