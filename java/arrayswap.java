package com.gpr.apps;
import java.util.Scanner;

public class arrayswap {

	public static void main(String[] args) {
		/*array across function are connected*/
		Scanner n=new Scanner(System.in);
		int [] arr=new int[2];
		arr[0]=10;
		arr[1]=20;
		swap(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);

	}
	public static void swap(int[]arr) {
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}

}
