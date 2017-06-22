package com.hackerrank.practice;

import java.util.HashSet;
import java.util.Scanner;

public class Solution3 {
	public int minimumNumberOfTravelDays(int[] a , int[] b){
		int aList[] = new int[100000];
		int aDistinctList[] = new int[100000];
		int lena = a.length;
		int lenb = b.length;
		int s=0 , countDist = 0;
		int minDays = Integer.MAX_VALUE;
		for(int i=0;i<lenb;i++){
			aDistinctList[b[i]]++;
		}
		for(int j = 0;j<lena;j++){
			aList[a[j]]++;
			if(aDistinctList[a[j]] !=0 && aList[a[j]] <= aDistinctList[a[j]]){
				countDist++;
			}
			
			if(countDist == lenb){
				while(aList[a[s]]>aDistinctList[a[s]] || aDistinctList[a[s]]==0){
					if(aList[a[s]]>aDistinctList[a[s]]){
						aList[a[s]]--;
					}
					s++;
				}
				int numOfHoliday = j - s+1;
				if(minDays> numOfHoliday){
					minDays = numOfHoliday;
				}
			}
		}
		return minDays;
	}
	static int[] distinctLocation(int[] a){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0 ; i < a.length;i++){
			if(!set.contains(a[i])){
				set.add(a[i]);
			}
		}
		int b[] = new int[set.size()];
		int k=0;
		for(int j : set){
			b[k++]=j;
		}
		return b;
	}
	
	public static void main(String[] args) {
		 	int A[] ;
		 	Solution3 obj = new Solution3();
		    Scanner in = new Scanner(System.in);
		    int numOfDays = in.nextInt();
		    A = new int[numOfDays];
		    for (int i = 0; i < numOfDays; i++) {
		        A[i] = in.nextInt();
		    }
		    System.out.println(obj.minimumNumberOfTravelDays(A,distinctLocation(A))) ;
		    
	}
}
