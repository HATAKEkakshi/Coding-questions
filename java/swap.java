package com.gpr.apps;
import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		

	}

}
