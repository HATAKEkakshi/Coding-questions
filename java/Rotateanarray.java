package com.gpr.apps;

import java.util.Scanner;

public class Rotateanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter the length of the array");
		int n=scn.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		rotate(arr,1,n);
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
		}
	}
	public static void rotate(int []arr,int k,int n) {
		int temp=arr[arr.length-1];
		for(int i=0;i<=k;i++) {
			for(int j=0;j<=n;j++) {
				arr[0]=temp;
				arr[i]=arr[i+1];
			}
		}
	}

}
