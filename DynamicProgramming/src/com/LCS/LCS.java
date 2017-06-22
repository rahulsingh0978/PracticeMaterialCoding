package com.LCS;

public class LCS {
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	static int[][] longestCommonSub(char input1[], char input2[]) {
		int i, j;
		int lcs[][] = new int[input2.length + 1][input1.length + 1];
		for (i = 0; i <= input2.length; i++) {
			for (j = 0; j <= input1.length; j++) {
				if (i == 0 || j == 0) {
					lcs[i][j] = 0;
				} else {
					if (input1[j - 1] == input2[i-1]) {
						lcs[i][j] = lcs[i - 1][j - 1] + 1;
					} else {
						lcs[i][j] = max(lcs[i - 1][j], lcs[i][j - 1]);
					}
				}
			}
		}
		return lcs;
	}

	public static void main(String[] args) {
		LCS obj = new LCS();
		char[] a = { 'a', 'b', 'c', 'd', 'a', 'f' };
		char[] b = { 'a', 'c', 'b', 'c', 'f' };
		int[][] h = new int[b.length + 1][a.length + 1];
		h = obj.longestCommonSub(a, b);
		for (int i = 0; i <= b.length; i++) {
			for (int j = 0; j <= a.length; j++) {
				System.out.print(h[i][j]+" ");
			}
			System.out.println();
		}
	}
}
