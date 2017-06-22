package com.O1Knapsack;

public class Knapsack {
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	static int knapsackO1(int w, int val[], int wt[], int n) {
		int i, j;
		int k[][] = new int[n + 1][w + 1];
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= w; j++) {
				if (j == 0 || i == 0) {
					k[i][j] = 0;
				} else {
					if (j < wt[i-1]) {
						k[i][j] = k[i - 1][j];
					} else {
						k[i][j] = max(val[i-1] + k[i - 1][j - wt[i-1]], k[i - 1][j]);
					}
				}
			}
		}
		return k[n][w];
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Knapsack obj = new Knapsack();
		int val[] = { 1, 4, 5, 7 };
		int wt[] = { 1, 3, 4, 5 };
		int maxWt = 7;
		System.out.println(obj.knapsackO1(maxWt, val, wt, wt.length));
		//below code is to see the matrix formed
/*		int h[][] =new int[wt.length+1][maxWt+1];
		h = obj.knapsackO1(maxWt, val, wt, wt.length);
		for(int i = 0 ; i <= wt.length ;i++){
			for(int j =0 ; j<= maxWt ; j++){
				System.out.print(h[i][j]+" ");
			}
			System.out.println();
		}
	*/	
	}
}
