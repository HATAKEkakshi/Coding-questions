package com.gpr.apps;
import java.util.Scanner;
public class leetcodetwosumproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("please enter the lenght of the array");
		int n=scn.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println("please enter the value of sum you want");
		int [] sum=new int[n];
		int x=scn.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]+arr[j]==x) {
					sum[i]=i;
					sum[j]=j;
				}
				break;
			}
		}
	for(int i=0;i<n;i++) {
		System.out.println(sum[i]);
	}
	}

}
