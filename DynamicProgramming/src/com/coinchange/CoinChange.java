package com.coinchange;

public class CoinChange {
	static int min(int a, int b) {
		return (a > b) ? b : a;
	}

	public int[][] coinChange(int[] a, int total) {
		int i, j;
		int n = a.length;
		int[][] cMat = new int[n][total];
		for (i = 0; i < n; i++) {
			for (j = 0; j < total; j++) {
				if (j == 0) {
					cMat[i][j] = 0;
				} else {
					if (a[i] == 1) {
						cMat[i][j] = j;
					} else if (j >= a[i]) {
						cMat[i][j] = min(cMat[i - 1][j], 1+cMat[i][j - a[i]]);
					} else {
						cMat[i][j] = cMat[i - 1][j];
					}
				}
			}
		}
		return cMat;
	}

	public static void main(String[] args) {
		int[] ar = { 1, 5, 6, 8 };
		int t = 11;
		CoinChange obj = new CoinChange();
		int[][] h = new int[ar.length][t];
		h = obj.coinChange(ar, t);
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < t; j++) {
				System.out.print(h[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
