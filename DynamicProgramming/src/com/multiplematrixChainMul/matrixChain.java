package com.multiplematrixChainMul;

public class matrixChain {
	/*public int[][] matrixMul(int arr[]){
        int temp[][] = new int[arr.length][arr.length];
        int q = 0;
        for(int l=2; l < arr.length; l++){
            for(int i=0; i < arr.length - l; i++){
                int j = i + l;
                temp[i][j] = 1000000;
                for(int k=i+1; k < j; k++){
                    q = temp[i][k] + temp[k][j] + arr[i]*arr[k]*arr[j];
                    if(q < temp[i][j]){
                        temp[i][j] = q;
                    }
                }
            }
        }
	return temp;
	}*/
	public int[][] matrixMul(int p[], int n) {
		int i, k, l, q = 0;
		int[][] mat = new int[n][n];
		
		/*  for(i= 0 ; i<n ; i++){ mat[i][i]=0; }*/
		 
		
		
		for (l = 2; l < n; l++) {
			System.out.println("l :"+l);
			for (i = 0; i < n - l; i++) {
				System.out.println("i :"+i);
				int j = i + l;
				System.out.println("j :"+j);
				mat[i][j] = 1000000;
				for (k = i + 1; k < j; k++) {
					q = mat[i][k] + mat[k][j] + p[i] * p[k] * p[j];
					System.out.println("k :"+k+" mat[i][k] + mat[k][j] + p[i] * p[k] * p[j] "+mat[i][k]+" "+mat[k][j]+" "+ p[i] * p[k] * p[j]);
					if (q < mat[i][j]) {
						mat[i][j] = q;
					}
				}
			}
		}
		return mat;
	}
	public static void main(String[] args) {
		matrixChain obj = new matrixChain();
		int a[] = {2,3,6,4,5};
		int[][] hi = new int[a.length][a.length];
		hi = obj.matrixMul(a , a.length);
		for(int i = 0 ; i < hi.length;i++){
			for(int j = 0 ; j <hi.length ; j++){
				System.out.print(hi[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
