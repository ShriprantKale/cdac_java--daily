package Assignments;

import java.util.Arrays;

public class Que2 {
public static void main(String args[]) {
	int[]arr= {1,2,8,3,4,7,5,6};
	int start=0;
	int end =arr.length-1;
	while(start<end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	System.out.println(Arrays.toString(arr));
	System.out.println();
	
	
}
}
