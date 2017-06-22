package com.divideandConquer;

public class QuickSort {

	void quickSort(int[] a, int low, int high) {
		int p;
		if (high > low) {
			p = partition(a, low, high);
			quickSort(a, low, p - 1);
			quickSort(a, p + 1, high);
		}
	}

	int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int l = low;
		int r = high;
		while (l < r) {
			while (a[l] <= pivot) {
				l++;
			}
			while (a[r] > pivot) {
				r--;
			}
			if (l < r) {
				swap(a , l , r);
			}
		}
		a[low] = a[r];
		a[r] = pivot;
		return r;
	}

	static void swap(int[] a , int i, int j) {
		a[i] = a[i] + a[j];
		a[j] = a[i] - a[j];
		a[i] = a[i] - a[j];
	}

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 8, 1, 9, 7 };
		QuickSort obj = new QuickSort();
		obj.quickSort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.print(" " + i);
		}
	}
}
