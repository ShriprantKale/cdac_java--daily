package day06_inheritance;

public class TestPerson2 {

	public static void main(String[] args) {
Person[]arr=new Person[5];
arr[0]=new Person(" shree",22,'M');
arr[1]=new Person(" kaur",22,'F');
arr[2]=new Person(" pratima",22,'F');
arr[3]=new Person(" nil",22,'M');
arr[4]=new Person(" chin",22,'M');

for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i].getName()+"is"+arr[i].getAge() +"yrs old and gender is"+arr[i].getGender());
	
	
}


	}
	
}
