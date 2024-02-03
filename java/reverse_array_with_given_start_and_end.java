package com.gpr.apps;

import java.util.Scanner;

public class reverse_array_with_given_start_and_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter the length of the array");
		int n=scn.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		reverse(arr,3,7);
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
		}
	}
	public static void swap(int [] arr) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter the index number you waned to swaped");
		int i=scn.nextInt();
		int j=scn.nextInt();
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void reverse(int [] arr,int s ,int e) {
		int sp=s;
		int ep=e;
		while(sp<ep){
			int temp=arr[sp];
			arr[sp]=arr[ep];
			arr[ep]=temp;
			sp++;
			ep--;
		}
	}

}
