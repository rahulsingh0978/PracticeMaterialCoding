package com.sorting;

import java.util.Scanner;

public class CountingSort {
	public void countingSort(int[] a , int[] output) {
		int n = a.length;
		
		int[] count = new int[200];
		for (int j = 0; j < 200; j++) {
			count[j]=0;
		}
		for (int i = 0; i < n; i++) {
			++count[a[i]];
		}
		for (int j = 1; j < 200; j++) {
			count[j] = count[j] + count[j - 1];
		}
		for (int i = 0; i < n; i++) {
			output[count[a[i]]-1] = a[i];
			--count[a[i]];
		}
		
		/*for(int j=0;j<n;j++){
			System.out.print(output[j]);
		}*/
	}
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int []f = new int[size];
		int []g= new int[size];
		for (int i = 0; i < size; i++) {
			f[i] = sc.nextInt();
		}
		CountingSort cobj = new CountingSort();
		cobj.countingSort(f ,g );
		for(int i :g){
			System.out.print(i+" ");
		}
	}
}
