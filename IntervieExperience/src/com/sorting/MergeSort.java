package com.sorting;

import java.util.Scanner;

public class MergeSort {
	public void mergesort(int[] a) {
		int n = a.length;
		if (n < 2) {
			return;
		}
		int newA[] = new int[n];
		int mid = n / 2;
		int leftA[] = new int[mid];
		int rightA[] = new int[n - mid];
		for (int i = 0; i < mid; i++) {
			leftA[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			rightA[i - mid] = a[i];
		}
		mergesort(leftA);
		mergesort(rightA);
		merge(leftA, rightA, a);

	}

	public void merge(int[] a, int[] b, int[] c) {
		int an = a.length;
		int bn = b.length;
		int cn = c.length;
		int i = 0, j = 0, k = 0;
		while (i < an && j < bn) {
			if (a[i] <= b[j]) {
				c[k] = a[i];

				i++;
			} else {
				c[k] = b[j];
				j++;

			}
			k++;
		}
		while (i < an) {
			c[k] = a[i];
			i++;
			k++;
		}
		while (j < bn) {
			c[k] = b[j];
			k++;
			j++;
		}

	}
	/*public int findMedian(int[] a , boolean flag){
		
	}*/

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // this is size of the array
		int m = sc.nextInt(); // this is size of the duration
		int noOfCheck = n - m; // this is number of loops
		int median = 0;
		int[] a = new int[n]; // the actual array
		int[] b = new int[m];  // array to get the block subarray for finding median
		int count = 0; // this is count of total fraud
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		/*for (int i : a) {
			System.out.print(i + " ");
		}*/

		MergeSort mobj = new MergeSort();
		// mobj.mergesort(a);

		/*
		 * System.out.println("After sort"); for(int i : a){ System.out.print(i+
		 * " "); }
		 */
		boolean flag = m % 2 == 0 ? true : false;
		int i , j;
		for (int o = 0; o < noOfCheck; o++) {
			if (flag) {
				j=0;
				for (i = o; i < m+o; i++) {
					b[j] =a[i];
					j++;
				}
				mobj.mergesort(b);
				median = (b[m/2]+b[m/2+1])/2;
				//for(int k=i ; k<n;k++){
					if(a[i] >=2*median){
						count++;
					}
				//}
			}
			else{
				j=0;
				for (i = o; i < m+o; i++) {
					b[j] =a[i];
					j++;
				}
				mobj.mergesort(b);
				median = b[m/2];
				
					if(a[i] >=2*median){
						count++;
					
				}
			}
		}
		System.out.print(count);
	}
}
