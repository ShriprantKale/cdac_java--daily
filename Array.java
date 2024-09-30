package day5;
import java.util.*;
public class Array{
	public static void main(String args[]) {
		 int[]arr=new int[5];
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the 5 elements of array");
		  for (int i=0; i<arr.length;i++) {
			  arr[i]=sc.nextInt();
			  
		  }
		  System.out.println("==================");
		  for(int i=0;i<arr.length;i++) {
			  System.out.println(arr[i]);
			  
			  
			  
		  System.out.println("==================");
		  for(int temp:arr) {
			  System.out.println(temp);
		  }
		  }}}
	

