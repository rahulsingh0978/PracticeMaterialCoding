package com.subsetsum;

public class SubSetSum {
	public boolean[][] subsetSumPossible(int []a, int sum){
		int i,j;
		boolean[][] sMat = new boolean[a.length+1][sum+1];
		for(i=0 ; i<=a.length ; i++)
			sMat[i][0] = true;
		for(i=1 ; i<=a.length ; i++){
			for(j=0;j<=sum;j++){
				if(a[i-1] >j){
					sMat[i][j]=sMat[i-1][j];
				}
				else{
					sMat[i][j] = sMat[i-1][j] || sMat[i-1][j-a[i-1]];
				}
			}
		}
		return sMat;
	}
	public static void main(String[] args) {
		SubSetSum obj = new SubSetSum();
		int sum = 11;
		int[] ar = {2,3,7,8,10};
		boolean[][] h = new boolean[ar.length+1][sum+1];
		h = obj.subsetSumPossible(ar, sum);
		for(int i=1;i<=ar.length;i++){
			for(int j=0;j<sum+1;j++){
				System.out.print(h[i][j]+" ");
			}
			System.out.println();
		}
	}
}
