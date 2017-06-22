package com.EggDroping;

public class EggDrop {
	public int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public int min(int a, int b) {
		return (a < b) ? a : b;
	}

	public int[][] eggDropping(int eggs, int floor) {
		int i, j, k, q;
		int[][] eMat = new int[eggs + 1][floor + 1];
		for (i = 1; i <= eggs; i++) {
			for (j = 1; j <= floor; j++) {

				if (i == 1) {
					eMat[i][j] = j;
				} else {
					q = 10000;
					if (i > j) {
						eMat[i][j] = eMat[i-1][j];
					} else {
						for (k = 1; k <= j; k++) {
							q = (max(eMat[i - 1][k-1], eMat[i][j - k]) < q)?  max(eMat[i - 1][k-1], eMat[i][j - k]): q;
						}
						eMat[i][j] = q+1;
					}
				}
			}
		}
		return eMat;
	}

	public static void main(String[] args) {
		EggDrop obj = new EggDrop();
		int eggs = 2;
		int floor = 6;
		int[][] h = new int[eggs + 1][floor + 1];
		h = obj.eggDropping(eggs, floor);
		for (int i = 1; i <= eggs; i++) {
			for (int j = 1; j <= floor; j++) {
				System.out.print(h[i][j] + " ");
			}
			System.out.println();
		}
	}
}
