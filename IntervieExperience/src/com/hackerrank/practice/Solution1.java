package com.hackerrank.practice;

import java.util.Scanner;

public class Solution1 {
	static int[] appendString() {
		String a = "0";
		while (a.length() <= 1000) {
			String[] s = a.split("");
			String temp = "";
			for (String i : s) {
				temp += Math.abs(1 - Integer.parseInt(i));
			}
			a = a + temp;
		}
		int i = 0;
		int[] iarray = new int[a.length()];
		for (String s : a.split("")) {

			try {
				iarray[i] = Integer.parseInt(s);
				i++;
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("Not a number: " + s + " at index " + i, e);
			}
		}
		return iarray;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int i = sc.nextInt();
		// int j;
		// int[] sn = appendString("0");
		// while(i-->0){
		// j = sc.nextInt();
		//
		// }
		int[] sn = appendString();
		  for (int k = 0; k < sn.length; k++) { System.out.print(sn[k]); }
		
		  
		  System.out.println("length : "+sn.length);
		/*System.out.println("1 " + appendString(2));
		System.out.println("2 " + appendString(5));
		System.out.println("3 " + appendString(7));*/
		
	}
}

