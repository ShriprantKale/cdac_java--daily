package Assignments;
//fobonacci series
public class Que5 {
public static void main(String args[]) {
	int[]arr=new int[5];
	arr[0]=0;
	arr[1]=1;
	System.out.println(arr[0]+" "+arr[1]);
	for(int i=2;i<arr.length-1;i++) {
		arr[i]=arr[i-1]+arr[i+2];
		System.out.println(""+arr[i]);
	}
}
}
