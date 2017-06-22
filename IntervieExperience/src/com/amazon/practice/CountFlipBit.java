package com.amazon.practice;
import java.io.*;
import java.util.Scanner;



public class CountFlipBit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i ;
		int j ;
		int xor;
		while(n-->0){
			i = sc.nextInt();
			j = sc.nextInt();
			xor = i^j;
			String bin =Integer.toBinaryString(xor);
			int k = Integer.parseInt(bin);
			int rem ,count=0 ;
			while(k!=0){
				rem = k%10;
				k = k/10;
				if(rem ==1){
					count++;
				}
			}
			System.out.println(count);
		}
			
	}
}
